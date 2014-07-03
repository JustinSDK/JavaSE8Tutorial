package cc.openhome;

import static java.lang.System.out;
 
class Hello {
    Runnable r1 = new Runnable() {
        public void run() {
            out.println(this);
        }
    };
    
    Runnable r2 = new Runnable() {
        public void run() {
            out.println(toString());
        }
    };
 
    public String toString() { 
        return "Hello, world!"; 
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.r1.run();
        hello.r2.run();
    }
}