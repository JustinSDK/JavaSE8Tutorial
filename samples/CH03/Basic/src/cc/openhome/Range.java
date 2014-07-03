package cc.openhome;

public class Range {
    public static void main(String[] args) {
        // byte、short、int、long 範圍
        System.out.printf("%d ~ %d%n", 
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Long.MIN_VALUE, Long.MAX_VALUE);
        // float、double 精度範圍
        System.out.printf("%d ~ %d%n", 
                Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d ~ %d%n", 
                Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        // char 可表示的 Unicode 範圍
        System.out.printf("%h ~ %h%n", 
                Character.MIN_VALUE, Character.MAX_VALUE);
        // boolean 的兩個值
        System.out.printf("%b ~ %b%n", 
                Boolean.TRUE, Boolean.FALSE);
    }    
}