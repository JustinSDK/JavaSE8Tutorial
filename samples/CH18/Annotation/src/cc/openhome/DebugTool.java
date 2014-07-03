package cc.openhome;

import static java.lang.System.out;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DebugTool {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Other> c = Other.class;
        Method method = c.getMethod("doOther");
        if(method.isAnnotationPresent(Debug.class)) {
            out.println("已設定 @Debug 標註");
            showDebugAnnotation(method);
        } else {
            out.println("沒有設定 @Debug 標註");
        }
        showAllAnnotations(method);
    }

    private static void showDebugAnnotation(Method method) {
        // 取得 @Debug 實例
        Debug debug = method.getAnnotation(Debug.class);
        out.printf("value: %s%n", debug.value());
        out.printf("name : %s%n", debug.name());
    }
    
    private static void showAllAnnotations(Method method) {
        Annotation[] annotations = method.getAnnotations();
        for(Annotation annotation : annotations) {
            out.println(annotation.annotationType().getName());
        }
    }
} 