package cc.openhome;

import java.util.*;
import static java.lang.System.out;

public class TimeZoneDemo2 {
    public static void main(String[] args) {
        TimeZone taipeiTz = TimeZone.getTimeZone("Asia/Taipei");
        Calendar calendar = Calendar.getInstance(taipeiTz);
        showTime(calendar);
        
        TimeZone copenhagenTz = TimeZone.getTimeZone("Europe/Copenhagen");
        calendar.setTimeZone(copenhagenTz);
        showTime(calendar);
    }
    
    static void showTime(Calendar calendar) {
        out.print(calendar.getTimeZone().getDisplayName());;
        out.printf(" %d:%d%n", 
                calendar.get(Calendar.HOUR), 
                calendar.get(Calendar.MINUTE));        
    }
}
