package cc.openhome;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Filters.class)
public @interface Filter {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Filters {
    Filter[] value();
}
