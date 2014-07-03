package cc.openhome;

public class Exercise1 {
    public static void main(String[] args) {
        for(Character c : new IterableString("Justin")) {
            System.out.println(c);
        }
        
        new IterableString("Monica").forEach(c -> System.out.println(c));
    }
}
