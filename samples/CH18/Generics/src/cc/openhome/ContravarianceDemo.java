package cc.openhome;

import static java.lang.System.out;
import java.util.Comparator;

public class ContravarianceDemo {
    public static void main(String[] args) {
        Comparator<Fruit> priceComparator =
                (fruit1, fruit2) -> fruit1.price - fruit2.price;
        
        Basket<Apple> apples = new Basket<>(
                new Apple(25, 150), new Apple(20, 100));
        apples.sort(priceComparator);
        for(Apple apple : apples.things) {
            out.printf("Apple(%d, %d) ",
                      apple.price, apple.weight);
        }
        out.println();
        
        Basket<Banana> bananas = new Basket<>(
                new Banana(50, 300), new Banana(30, 200));
        bananas.sort(priceComparator);
        for(Banana banana : bananas.things) {
            out.printf("Banana(%d, %d) ",
                       banana.price, banana.weight);
        }
        out.println();
    }
}
