package cc.openhome;

class Clothes2 {
    String color;
    char size;
    /*
     * 補上建構式
     */
}

public class Field2 {
    public static void main(String[] args) {
        // 按照範例修改以下內容
        Clothes2 sun = new Clothes2();
        Clothes2 spring = new Clothes2();
        
        sun.color = "red";
        sun.size = 'S';
        spring.color = "green";
        spring.size = 'M';
        
        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring (%s, %c)%n", spring.color, spring.size);
    }
}