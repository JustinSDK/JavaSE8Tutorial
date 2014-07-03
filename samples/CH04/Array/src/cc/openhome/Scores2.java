package cc.openhome;

import java.util.Arrays;

public class Scores2 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        for(int score : scores) {
            System.out.printf("%2d", score);
        }
        System.out.println();
        Arrays.fill(scores, 60);
        for(int score : scores) {
            System.out.printf("%3d", score);
        }
    }
}