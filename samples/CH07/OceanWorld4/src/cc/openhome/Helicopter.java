package cc.openhome;

public class Helicopter extends Airplane {
    public Helicopter(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.printf("飛機 %s 在飛%n", name);
    }
}
