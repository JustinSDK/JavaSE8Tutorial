package cc.openhome;

public class ThreadGroupDemo {

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group") {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                System.out.printf("%s: %s%n", 
                        thread.getName(), throwable.getMessage());
            }
        };

        Thread thread = new Thread(group, () -> {
            throw new RuntimeException("測試例外");
        });

        thread.start();
    }
}
