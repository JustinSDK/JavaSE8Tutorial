package cc.openhome;

import static java.lang.System.out;

public class Game {
    public static void main(String[] args) {
        play(Action.RIGHT);
        play(Action.UP);
    } 

    public static void play(Action action) {
        switch(action) {
            case STOP:  // 也就是Action.STOP
                out.println("播放停止動畫");
                break;
            case RIGHT: // 也就是Action.RIGHT
                out.println("播放向右動畫");
                break;
            case LEFT: // 也就是Action.LEFT
                out.println("播放向左動畫");
                break;
            case UP:    // 也就是Action.UP
                out.println("播放向上動畫");
                break;
            case DOWN: // 也就是Action.DOWN
                out.println("播放向下動畫");
                break;
        }
    }   
}