package cc.openhome;

public class RPG {
    public static void main(String[] args) {
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);

        Magician magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        
        showBlood(swordsMan);
        showBlood(magician);
    }

    static void showBlood(Role role) {
        System.out.printf("%s 血量 %d%n",
                role.getName(), role.getBlood());
    }
}