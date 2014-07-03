package cc.openhome;

public class Scores {
    public static void main(String[] args) {
        int[] scores = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
        for(int i = 0; i < scores.length; i++) {
            System.out.printf("學生分數：%d %n", scores[i]);
        }
    }
}
