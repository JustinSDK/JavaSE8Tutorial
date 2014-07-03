package cc.openhome;

public class Shark extends Fish {
   public Shark(String name) {
       super(name);
   }
   
    @Override
    public void swim() {
        System.out.printf("鯊魚 %s 游泳%n", name);
    }
}
