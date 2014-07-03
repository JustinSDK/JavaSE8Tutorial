package cc.openhome;

class Variable2 {
    static int i = 0, j = 0;

    static synchronized void one() {
        i++;
        j++;
    }

    static synchronized void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}

public class Variable2Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Variable2.one();
            }
        });
        Thread thread2 = new Thread(() -> {
            while (true) {
                    Variable2.two();
                }
        }); 
        
        thread1.start();
        thread2.start();
    }
}
