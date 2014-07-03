package cc.openhome;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int[] number = {1, 10, 31, 33, 37, 48, 60, 70, 80};
        int[] tmp = new int[number.length + 1];
        for(int i = 1; i < tmp.length; i++) {
            tmp[i] = number[i - 1];  
        }
        
        System.out.print("想搜尋？");
        tmp[0] = new Scanner(System.in).nextInt();
        
        int i = number.length; 
        while(tmp[i] != tmp[0]) {
            i--; 
        }

        System.out.println(i - 1);    
    }
}
