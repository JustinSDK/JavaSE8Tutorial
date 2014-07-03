package cc.openhome;

import java.util.concurrent.*;
import static java.lang.System.*;

public class FutureCallableDemo {
    static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) throws Exception {
        FutureTask<Long> the30thFibFuture = 
                new FutureTask<>(() -> fibonacci(30));

        out.println("老闆，我要第 30 個費式數，待會來拿...");
        
        new Thread(the30thFibFuture).start();
        while(!the30thFibFuture.isDone()) {
            out.println("忙別的事去...");
        }
        
        out.printf("第 30 個費式數：%d%n", the30thFibFuture.get());        
    }
}
