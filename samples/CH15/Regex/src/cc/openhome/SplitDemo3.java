package cc.openhome;

public class SplitDemo3 {
    public static void main(String[] args) {
      for(String str : "Justin dog Monica doggie Irene".split("\\bdog\\b")) {
            System.out.println(str.trim());
        }
    }
}
