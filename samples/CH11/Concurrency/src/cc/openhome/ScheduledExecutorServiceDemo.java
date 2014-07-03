package cc.openhome;

import java.util.concurrent.*;

public class ScheduledExecutorServiceDemo {

    public static void main(String[] args) {
        ScheduledExecutorService service
                = Executors.newSingleThreadScheduledExecutor();
        
        service.scheduleWithFixedDelay(
                () -> {
                    System.out.println(new java.util.Date());
                    try {
                        Thread.sleep(2000); // 假設這個工作會進行兩秒
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }, 2000, 1000, TimeUnit.MILLISECONDS);
    }
}
