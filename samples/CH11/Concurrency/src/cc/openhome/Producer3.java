package cc.openhome;

import java.util.concurrent.BlockingQueue;

public class Producer3 implements Runnable {
    private BlockingQueue<Integer> productQueue; 
    
    public Producer3(BlockingQueue<Integer> productQueue) { 
        this.productQueue = productQueue; 
    } 
    
    public void run() { 
        System.out.println("生產者開始生產整數......"); 
        for(int product = 1; product <= 10; product++) { 
            try { 
                productQueue.put(product);
                System.out.printf("生產者提供整數 (%d)%n", product);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }       
    } 
}
