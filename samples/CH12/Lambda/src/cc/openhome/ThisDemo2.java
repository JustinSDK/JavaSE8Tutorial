package cc.openhome;

import static java.lang.System.out;
 
class Hello2 {
    Runnable r1 = () -> out.println(this);
    Runnable r2 = () -> out.println(toString());
 
    public String toString() { 
        return "Hello, world!"; 
    }
}

public class ThisDemo2 {
    public static void main(String[] args) {
        Hello2 hello = new Hello2();
        hello.r1.run();
        hello.r2.run();
    }
}