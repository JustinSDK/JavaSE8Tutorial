package cc.openhome;

import static java.lang.System.out;

public class ClassLoaderHierarchy {
    public static void main(String[] args) {
        Some some = new Some();      // 生成Some實例
        Class clz = some.getClass(); // 取得Some.class的Class實例
        ClassLoader loader = clz.getClassLoader();    // 取得ClassLoader
        out.println(loader);
        out.println(loader.getParent());       // 取得父ClassLoader
        out.println(loader.getParent().getParent()); // 再取得父ClassLoader
    }
} 
