package cc.openhome;

public class SortDemo {
    public static void main(String[] args) {
       String[] strs = {"3", "2", "5", "1"};
       for(String s : Sort.sorted(strs)) {
           System.out.println(s);
       } 
    }
}
