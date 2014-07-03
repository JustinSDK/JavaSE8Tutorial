package cc.openhome;

public class SwordsMan {
    private String name;
    private int level;
    private int blood;

    public void fight() {
        System.out.println("揮劍攻擊");
    }
    
    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
