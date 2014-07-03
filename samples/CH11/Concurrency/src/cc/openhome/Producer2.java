package cc.openhome;

public class Producer2 implements Runnable {
    private Clerk2 clerk; 
    
    public Producer2(Clerk2 clerk) { 
        this.clerk = clerk; 
    } 
    
    public void run() { 
        System.out.println("生產者開始生產整數......"); 
        for(int product = 1; product <= 10; product++) { 
            try { 
                clerk.setProduct(product);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }       
    } 
}
