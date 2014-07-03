package cc.openhome;

class Variable1 {
    static int i = 0, j = 0;

    static void one() {
        i++;
        j++;
    }

    static void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}

public class Variable1Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Variable1.one();
            }
        });
        Thread thread2 = new Thread(() -> {
            while (true) {
                Variable1.two();
            }
        });
        
        thread1.start();
        thread2.start();
    }
}
