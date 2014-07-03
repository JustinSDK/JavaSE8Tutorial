package cc.openhome;

import static java.lang.System.out;

public class InfoAbout {
    public static void main(String[] args) {
        try {
            Class clz = Class.forName(args[0]);
            out.println("類別名稱：" + clz.getName());
            out.println("是否為介面：" + clz.isInterface());
            out.println("是否為基本型態：" + clz.isPrimitive());
            out.println("是否為陣列：" + clz.isArray());
            out.println("父類別：" + clz.getSuperclass().getName());
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("沒有指定類別名稱");
        } catch (ClassNotFoundException e) {
            out.println("找不到指定的類別 " + args[0]);
        }
    }
}
