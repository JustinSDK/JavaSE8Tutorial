package cc.openhome;

public class Seaplane extends Airplane implements Swimmer {
    public Seaplane(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.print("海上");
        super.fly();
    }

    @Override
    public void swim() {
        System.out.printf("海上飛機 %s 航行海面%n", name);
    }
}
