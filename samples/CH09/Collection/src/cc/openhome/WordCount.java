package cc.openhome;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("請輸入英文：");
        Set words = tokenSet(console.nextLine());
        System.out.printf("不重複單字有 %d 個：%s%n", words.size(), words);
    }
    
    static Set tokenSet(String line) {
        String[] tokens = line.split(" ");
        return new HashSet(Arrays.asList(tokens));
    }
}