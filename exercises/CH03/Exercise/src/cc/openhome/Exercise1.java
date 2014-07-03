package cc.openhome;

public class Exercise1 {
    public static void main(String[] args) {
        int m = 1000;
        int n = 495;
        while(n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        System.out.printf("最大公因數 %d%n", m);
    }
}
