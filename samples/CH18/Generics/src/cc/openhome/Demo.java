package cc.openhome;

import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Basket<Banana> bananas = new Basket<>(
    new Banana(30, 200), new Banana(50, 300));
    bananas.sort((banana1, banana2) -> banana1.price - banana2.price);

    }
}
