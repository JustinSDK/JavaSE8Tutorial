package cc.openhome;

public class StackTraceDemo2 { 
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
            throw ex;
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