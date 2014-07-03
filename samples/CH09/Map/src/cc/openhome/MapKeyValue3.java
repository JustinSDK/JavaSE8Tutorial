package cc.openhome;

import java.util.*;

public class MapKeyValue3 {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        map.forEach(
           (key, value) -> System.out.printf("(鍵 %s, 值 %s)%n", key, value)
        );
    }
}
