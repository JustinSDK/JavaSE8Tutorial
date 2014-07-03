package cc.openhome;

import java.util.*;
import static java.lang.System.out;

public class MapKeyValue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        
        out.println("顯示鍵");
        // keySet()傳回Set
        map.keySet().forEach(key -> out.println(key));
        
        out.println("顯示值");
        // values()傳回Collection
        map.values().forEach(key -> out.println(key));
    }
}
