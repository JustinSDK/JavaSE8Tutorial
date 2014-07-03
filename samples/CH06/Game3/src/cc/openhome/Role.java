package cc.openhome;

public class Role {
    private String name;
    private int level;
    private int blood;
    
    public void fight() {
        // 子類別要重新定義fight()的實際行為
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
