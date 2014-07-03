package cc.openhome;

import java.lang.reflect.*;
import java.util.*;

public class BeanUtil {
    public static <T> T getBean(Map<String, Object> data, String clzName)
                                   throws Exception {
        Class clz = Class.forName(clzName);
        Object bean = clz.newInstance();
        
        data.entrySet().forEach(entry -> {
            String setter = String.format("set%s%s",
                    entry.getKey().substring(0, 1).toUpperCase(), 
                    entry.getKey().substring(1));
            try {
                // 根據方法名稱與參數型態取得 Method 實例
                Method method = clz.getMethod(
                        setter, entry.getValue().getClass());
                // 必須是公開方法
                if(Modifier.isPublic(method.getModifiers())) {
                    // 指定實例與參數值呼叫方法
                    method.invoke(bean, entry.getValue());
                }
            } catch(IllegalAccessException | IllegalArgumentException | 
                    NoSuchMethodException | SecurityException | 
                    InvocationTargetException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        return (T) bean;  
    }
}
