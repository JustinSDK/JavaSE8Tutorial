package cc.openhome;

import java.lang.reflect.Method;

class Dog {
    public void quack() {
        System.out.println("狗兒呱呱叫");
    }
}

public class Exercise {
    public static void main(String[] args) throws Exception {
        doQuack(new Dog());
    }
   
    public static void doQuack(Object duck) throws Exception {
        Method quack = duck.getClass().getMethod("quack");
        quack.invoke(duck);
    }
}