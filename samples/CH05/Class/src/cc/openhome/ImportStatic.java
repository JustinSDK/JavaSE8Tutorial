package cc.openhome;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class ImportStatic {
    public static void main(String[] args) {
        Scanner console = new Scanner(in);
        out.print("請輸入姓名：");
        out.printf("%s 你好！%n", console.nextLine());
    }
}
