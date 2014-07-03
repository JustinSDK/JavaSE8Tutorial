package cc.openhome;

import static java.lang.System.out;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        
        numbers.filter(n -> n > 5).forEach(out::println);
        numbers.map(n -> n * 2).forEach(out::println);
        out.println(numbers.reduce((total, n) -> total + n).orElse(0));
        out.println(new ArrayList<Integer>().reduce((total, n) -> total + n).orElse(0));
    }
}
