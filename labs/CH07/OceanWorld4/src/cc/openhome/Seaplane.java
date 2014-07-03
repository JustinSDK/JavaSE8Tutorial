package cc.openhome;

public class Seaplane implements Swimmer, Flyer {
    private String name;
    
    public Seaplane(String name) {
        this.name = name;
    }
    
    @Override
    public void fly() {
        System.out.printf("海上飛機 %s 在飛%n", name);
    }

    @Override
    public void swim() {
        System.out.printf("海上飛機 %s 航行海面%n", name);
    }
}
