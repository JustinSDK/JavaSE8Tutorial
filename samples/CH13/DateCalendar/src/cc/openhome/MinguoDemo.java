package cc.openhome;

import static java.lang.System.out;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.MinguoDate;

public class MinguoDemo {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(1975, 5, 26);
        MinguoDate mingoBirth = MinguoDate.from(birth);
        out.println(mingoBirth);
        out.println(MinguoDate.now());
        
        out.println(MinguoDate.of(64, 5, 1).atTime(LocalTime.of(3, 30, 0)));
    }
}
