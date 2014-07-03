package cc.openhome;

import static java.lang.System.out;

class Some2 {
    static {
        out.println("[執行靜態區塊]");
    }
}

public class SomeDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clz = Class.forName("cc.openhome.Some2", false, 
                SomeDemo2.class.getClassLoader());
        out.println("已載入 Some2.class ");
        Some2 s;
        out.println("宣告 Some 參考名稱");
        s = new Some2();
        out.println("生成 Some 實例");
    }
} 
