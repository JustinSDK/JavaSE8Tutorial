package cc.openhome;

public class Magician extends Role {
    public void fight() {
        System.out.println("魔法攻擊");
    }
    
    public void cure() {
        System.out.println("魔法治療");
    }
    
    public String toString() {
        return String.format("魔法師 (%s, %d, %d)", this.name, 
                this.level, this.blood);
    }
}
