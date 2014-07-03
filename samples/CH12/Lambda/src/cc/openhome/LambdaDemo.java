package cc.openhome;

import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, (name1, name2) -> name1.length() - name2.length());
        System.out.println(Arrays.toString(names));
    }
}
