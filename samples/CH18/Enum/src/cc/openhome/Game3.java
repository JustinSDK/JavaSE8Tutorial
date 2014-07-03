package cc.openhome;

public class Game3 {
    public static void play(Action3 action) {
        action.execute();
    }
    
    public static void main(String[] args) {
        Game3.play(Action3.RIGHT);
        Game3.play(Action3.DOWN);
    }
}
