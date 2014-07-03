package cc.openhome;

class Some {
    void someMethod(int i) {
        System.out.println("int 版本被呼叫");
    }
    void someMethod(Integer integer) {
        System.out.println("Integer 版本被呼叫");
    }
}

public class OverloadBoxing {
    public static void main(String[] args) {
        Some s = new Some();
        s.someMethod(1);
    }
}
