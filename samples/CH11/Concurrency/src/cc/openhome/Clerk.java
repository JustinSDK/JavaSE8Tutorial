package cc.openhome;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clerk {
    private int product = -1;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void setProduct(int product) throws InterruptedException {
        lock.lock();        
        try {
            waitIfFull();
            this.product = product;
            System.out.printf("生產者設定 (%d)%n", this.product);
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    private void waitIfFull() throws InterruptedException {
        while (this.product != -1) {
            condition.await();
        }
    }

    public int getProduct() throws InterruptedException {
        lock.lock();        
        try {
            waitIfEmpty();
            int p = this.product;
            this.product = -1;
            System.out.printf("消費者取走 (%d)%n", p);
            condition.signal();
            return p;
        } finally {
            lock.unlock();
        }
    }

    private void waitIfEmpty() throws InterruptedException {
        while (this.product == -1) {
            condition.await();
        }
    }
}
