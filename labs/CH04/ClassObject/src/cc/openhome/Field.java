package cc.openhome;

class Clothes {
    String color;
    char size;
}

public class Field {
    public static void main(String[] args) {
        Clothes sun = new Clothes();
        Clothes spring = new Clothes();

        sun.color = "red";
        sun.size = 'S';        
        spring.color = "green";
        spring.size = 'M';
        
        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring (%s, %c)%n", spring.color, spring.size);
    }
}