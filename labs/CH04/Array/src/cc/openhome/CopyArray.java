package cc.openhome;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] scores1 = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
        int[] scores2 = Arrays.copyOf(scores1, scores1.length);
        for(int score : scores2) {
            System.out.printf("%3d", score);
        }
        System.out.println();
        scores2[0] = 99;
        // 不影響score1參考的陣列物件
        for(int score : scores1) {
            System.out.printf("%3d", score);
        }
    }
}