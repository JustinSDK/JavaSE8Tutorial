package cc.openhome;

public class StackTraceDemo3 {
    public static void main(String[] args) {
        try {
            c();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
        }
    }  

    static void c() {
        try {
            b();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
            Throwable t = ex.fillInStackTrace();
            throw (NullPointerException) t;
        }
    }

    static void b() {
        a();
    }

    static String a() {
        String text = null;
        return text.toUpperCase();
    }  
}