package cc.openhome;

public class Piranha extends Fish {
   public Piranha(String name) {
       super(name);
   }
   
    @Override
    public void swim() {
        System.out.printf("食人魚 %s 游泳%n", name);
    }    
}
