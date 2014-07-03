package cc.openhome;

import java.time.*;
import java.util.Scanner;
import static java.lang.System.out;

public class HowOld2 {
    public static void main(String[] args) {
        out.print("輸入出生年月日（yyyy-mm-dd）：");
        LocalDate birth = LocalDate.parse(new Scanner(System.in).nextLine());
        LocalDate now = LocalDate.now();
        Period period = Period.between(birth, now);
        out.printf("你活了 %d 年 %d 月 %d 日%n", 
                period.getYears(), period.getMonths(), period.getDays());
    }
}
