package cc.openhome;

import static java.lang.System.out;
import java.time.Month;

public class MonthDemo {
    public static void main(String[] args) {
        for(Month month : Month.values()) {
            out.printf("original: %d\tvalue: %d\t%s%n", 
                    month.ordinal(), month.getValue(), month);
        }
    }
}
