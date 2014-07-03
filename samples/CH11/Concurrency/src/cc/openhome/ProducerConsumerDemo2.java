package cc.openhome;

public class ProducerConsumerDemo2 {
    public static void main(String[] args) {
        Clerk2 clerk = new Clerk2(); 
        new Thread(new Producer2(clerk)).start(); 
        new Thread(new Consumer2(clerk)).start(); 
    }    
}
