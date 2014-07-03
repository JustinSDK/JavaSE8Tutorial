package cc.openhome;

class Clothes2 {
    String color;
    char size;
    Clothes2(String color, char size) {
        this.color = color;
        this.size = size;
    }
}

public class Field2 {
    public static void main(String[] args) {
        Clothes2 sun = new Clothes2("red", 'S');
        Clothes2 spring = new Clothes2("green", 'M');
        
        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring (%s, %c)%n", spring.color, spring.size);
    }
}