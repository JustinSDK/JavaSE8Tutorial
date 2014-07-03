package cc.openhome;

import java.lang.reflect.*;
import java.util.logging.*;

public class LoggingHandler implements InvocationHandler {    
    private Object target;
    
    public Object bind(Object target) { 
        this.target = target; 
        return Proxy.newProxyInstance( 
                           target.getClass().getClassLoader(), 
                           target.getClass().getInterfaces(), 
                           this); 
    }

    public Object invoke(Object proxy, Method method, 
                         Object[] args) throws Throwable { 
        Object result = null; 
        try { 
            log(String.format("%s() 呼叫開始...", method.getName()));
            result = method.invoke(target, args);
            log(String.format("%s() 呼叫結束...", method.getName()));
        } catch (IllegalAccessException | IllegalArgumentException | 
                InvocationTargetException e){ 
            log(e.toString()); 
        }
        
        return result; 
    } 
    
    private void log(String message) {
        Logger.getLogger(LoggingHandler.class.getName())
               .log(Level.INFO, message);
    }
}
