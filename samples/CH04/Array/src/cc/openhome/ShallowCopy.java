package cc.openhome;

class Clothes {
    String color;
    char size;
    Clothes(String color, char size) {
        this.color = color;
        this.size = size;
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        Clothes[] c1 = {new Clothes("red", 'L'), new Clothes("blue", 'M')};
        Clothes[] c2 = new Clothes[c1.length];
        for(int i = 0; i < c1.length; i++) {
            c2[i] = c1[i];
        }
        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
} 