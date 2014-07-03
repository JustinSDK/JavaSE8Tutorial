package cc.openhome;

public class Human implements Swimmer {
    private String name;
    public Human(String name) {
        this.name = name;
    } 
    public String getName() {
        return name;
    }
    
    @Override
    public void swim() {
        System.out.printf("人類 %s 游泳%n", name);
    }
}
