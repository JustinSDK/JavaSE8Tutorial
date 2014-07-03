package cc.openhome;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ClientListenerInstaller {
    private ClientQueue queue;
    private Map<String, Method> methods = new HashMap<>();    
    
    public ClientListenerInstaller(ClientQueue queue) throws Exception {
        this.queue = queue;
    }
    
    public void install(Class<?> clz) throws Exception {
        collectAnnotatedMethods(clz);
        
        // 建立代理物件
        Object listenerProxy = Proxy.newProxyInstance(
                ClientListener.class.getClassLoader(),
                new Class[] { ClientListener.class },
                (proxy, method, args) -> 
                methods.get(method.getName()).invoke(clz.newInstance(), args)
        );
        
        // 用代理物件作註冊
        Method addclientListener = 
            queue.getClass().getMethod(
            		"addClientListener", ClientListener.class);
        
        addclientListener.invoke(queue, listenerProxy);
    }

    private void collectAnnotatedMethods(Class<?> clz) throws SecurityException {
        // 找出標註的方法
        for(Method method : clz.getMethods()) {
            ClientAdded clientAdded =
                    method.getAnnotation(ClientAdded.class);
            if(clientAdded != null) {
                methods.put("clientAdded", method);
            }
            ClientRemoved clientRemoved =
                    method.getAnnotation(ClientRemoved.class);
            if(clientRemoved != null) {
                methods.put("clientRemoved", method);
            }
        }
    }
}