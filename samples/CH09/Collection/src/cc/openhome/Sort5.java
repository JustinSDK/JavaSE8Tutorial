import java.util.*;

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class Sort5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
        Collections.sort(words, new StringComparator());
        System.out.println(words);
    }
}