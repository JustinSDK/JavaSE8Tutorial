package cc.openhome;

import static java.lang.System.out;
import java.lang.reflect.*;

public class ClassViewer {
    public static void main(String[] args) {
        try {
            ClassViewer.view(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("沒有指定類別");
        } catch (ClassNotFoundException e) {
            out.println("找不到指定類別");
        }
    }
        
    public static void view(String clzName) throws ClassNotFoundException {
        Class clz = Class.forName(clzName);

        showPackageInfo(clz);
        showClassInfo(clz);

        out.println("{");

        showFiledsInfo(clz);
        showConstructorsInfo(clz);
        showMethodsInfo(clz);

        out.println("}");
    }

    private static void showPackageInfo(Class clz) {
        Package p = clz.getPackage(); // 取得套件代表物件
        out.printf("package %s;%n", p.getName());
    }

    private static void showClassInfo(Class clz) {
        int modifier = clz.getModifiers();   // 取得型態修飾常數
        out.printf("%s %s %s",
                Modifier.toString(modifier), // 將常數轉為字串表示
                Modifier.isInterface(modifier) ? "interface" : "class",
                clz.getName() // 取得類別名稱
        );
    }

    private static void showFiledsInfo(Class clz) throws SecurityException {
        // 取得宣告的資料成員代表物件
        Field[] fields = clz.getDeclaredFields();
        for (Field field : fields) {
            // 顯示權限修飾，像是public、protected、private
            out.printf("\t%s %s %s;%n",
                    Modifier.toString(field.getModifiers()),
                    field.getType().getName(), // 顯示型態名稱
                    field.getName() // 顯示資料成員名稱
            );
        }
    }

    private static void showConstructorsInfo(Class clz) throws SecurityException {
        // 取得宣告的建構方法代表物件
        Constructor[] constructors = clz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            // 顯示權限修飾，像是public、protected、private
            out.printf("\t%s %s();%n",
                    Modifier.toString(constructor.getModifiers()),
                    constructor.getName() // 顯示建構式名稱
            );
        }
    }

    private static void showMethodsInfo(Class clz) throws SecurityException {
        // 取得宣告的方法成員代表物件
        Method[] methods = clz.getDeclaredMethods();
        for (Method method : methods) {
            // 顯示權限修飾，像是public、protected、private
            out.printf("\t%s %s %s();%n",
                    Modifier.toString(method.getModifiers()),
                    method.getReturnType().getName(), // 顯示返回值型態名稱
                    method.getName() // 顯示方法名稱
            );
        }
    }
}
