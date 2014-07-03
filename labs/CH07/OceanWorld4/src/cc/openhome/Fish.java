package cc.openhome;

public abstract class Fish implements Swimmer {
    protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public abstract void swim();
}
