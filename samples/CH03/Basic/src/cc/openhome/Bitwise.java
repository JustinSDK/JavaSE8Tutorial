package cc.openhome;

public class Bitwise {
    public static void main(String[] args) {
        System.out.println("AND運算："); 
        System.out.printf("0 AND 0 %5d%n", 0 & 1);
        System.out.printf("0 AND 1 %5d%n", 0 & 1); 
        System.out.printf("1 AND 0 %5d%n", 1 & 0); 
        System.out.printf("1 AND 1 %5d%n", 1 & 1); 

        System.out.println("\nOR運算："); 
        System.out.printf("0 OR 0 %6d%n", 0 | 0); 
        System.out.printf("0 OR 1 %6d%n", 0 | 1); 
        System.out.printf("1 OR 0 %6d%n", 1 | 0); 
        System.out.printf("1 OR 1 %6d%n", 1 | 1); 

        System.out.println("\nXOR運算："); 
        System.out.printf("0 XOR 0 %5d%n", 0 ^ 0); 
        System.out.printf("0 XOR 1 %5d%n", 0 ^ 1); 
        System.out.printf("1 XOR 0 %5d%n", 1 ^ 0); 
        System.out.printf("1 XOR 1 %5d%n", 1 ^ 1); 
    }
}
