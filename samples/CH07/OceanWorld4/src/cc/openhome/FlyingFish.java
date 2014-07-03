package cc.openhome;

public class FlyingFish extends Fish implements Flyer {
    public FlyingFish(String name) {
        super(name);
    }
    
    @Override
    public void swim() {
        System.out.println("飛魚游泳");
    }

    @Override
    public void fly() {
        System.out.println("飛魚會飛");
    } 
}