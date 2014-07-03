package cc.openhome;

import static java.lang.System.out;

public class SecurityTool {
    public static void main(String[] args) {
        Filter[] filters = SecurityFilter.class.
                getAnnotationsByType(Filter.class);
        for(Filter filter : filters) {
            out.println(filter.value());
        }
        
        out.println(SecurityFilter.class.getAnnotation(Filter.class));
    }
}
