package cc.openhome;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        //  補上程式碼
        int number = (int) (Math.random() * 10);
        int guess;
        
        do {
            System.out.print("猜數字（0 ~ 9）:");
            guess = // 補上程式碼
        } while(guess != number);
        
        System.out.println("猜中了...XD");
    }
}
