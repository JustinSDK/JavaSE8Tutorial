package cc.openhome;

import static java.lang.System.out;

public class ClassInfo {
    public static void main(String[] args) {
        Class clz = String.class;
        out.println("類別名稱：" + clz.getName());
        out.println("是否為介面：" + clz.isInterface());
        out.println("是否為基本型態：" + clz.isPrimitive());
        out.println("是否為陣列物件：" + clz.isArray());
        out.println("父類別名稱：" + clz.getSuperclass().getName());
    }    
}
