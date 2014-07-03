package cc.openhome;

public class ReplaceDemo {
    public static void main(String[] args) {
        String[] regexs = {".*foo", ".*?foo", ".*+foo"};
        for(String regex : regexs) {
            System.out.println("xfooxxxxxxfoo".replaceAll(regex, "Orz"));
        }
    }
}
