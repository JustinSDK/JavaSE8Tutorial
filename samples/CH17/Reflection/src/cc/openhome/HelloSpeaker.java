package cc.openhome;

public class HelloSpeaker implements Hello {
    public void hello(String name) {
        System.out.printf("哈囉, %s%n", name); 
    }
}
