package cc.openhome;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, String::compareTo);
        System.out.println(Arrays.toString(names));
    }
}
