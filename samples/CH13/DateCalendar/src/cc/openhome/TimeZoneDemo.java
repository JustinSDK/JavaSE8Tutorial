package cc.openhome;

import static java.lang.System.out;
import java.util.TimeZone;

public class TimeZoneDemo {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        out.println(timeZone.getDisplayName());
        out.println("\t時區ID：" + timeZone.getID());
        out.println("\t日光節約時數：" + timeZone.getDSTSavings());
        out.println("\tUTC 偏移毫秒數：" + timeZone.getRawOffset());
    }
}
