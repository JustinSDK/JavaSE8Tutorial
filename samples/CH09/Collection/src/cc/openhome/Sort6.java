package cc.openhome;

import java.util.*;
import static java.util.Comparator.*;

public class Sort6 {
    public static void main(String[] args) {
        List words = Arrays.asList(
                "B", "X", "A", "M", null ,"F", "W", "O", null);
        words.sort(nullsFirst(reverseOrder()));
        System.out.println(words);
    }
}