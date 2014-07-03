package cc.openhome;

import java.util.*;
import java.text.*;

public class HowOld {
    public static void main(String[] args) throws Exception {
        System.out.print("輸入出生年月日（yyyy-mm-dd）：");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date birthDate = dateFormat.parse(new Scanner(System.in).nextLine());
        Date currentDate = new Date();
        long life = currentDate.getTime() - birthDate.getTime();
        System.out.println("你今年的歲數為：" + 
                  (life / (365 * 24 * 60 * 60 * 1000L)));
    }
}
