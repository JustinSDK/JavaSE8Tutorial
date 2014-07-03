package cc.openhome;

import java.util.concurrent.*;

class Fibonacci extends RecursiveTask<Long> {
    final long n;

    Fibonacci(long n) {
        this.n = n;
    }

    @Override
    public Long compute() {
        if (n <= 25) {
            return solveFibonacciSequentially(n);
        }
        ForkJoinTask<Long> subTask = new Fibonacci(n - 1).fork();
        return new Fibonacci(n - 2).compute() + subTask.join();
    }

    static long solveFibonacciSequentially(long n) {
        if (n <= 1) {
            return n;
        }
        return solveFibonacciSequentially(n - 1)
                + solveFibonacciSequentially(n - 2);
    }
}

public class FibonacciForkJoin {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(45);
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.invoke(fibonacci));
    }
}
