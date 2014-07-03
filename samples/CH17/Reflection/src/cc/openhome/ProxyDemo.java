package cc.openhome;
public class ProxyDemo {
    public static void main(String[] args) { 
        LoggingHandler loggingHandler  = new LoggingHandler();  
        Hello helloProxy = (Hello) loggingHandler.bind(new HelloSpeaker()); 
        helloProxy.hello("Justin");
    }
} 
