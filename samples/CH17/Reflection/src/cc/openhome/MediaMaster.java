package cc.openhome;

import java.util.Scanner;

public class MediaMaster {
    public static void main(String[] args) throws ClassNotFoundException, 
                            InstantiationException, IllegalAccessException {
        String playerImpl = System.getProperty("cc.openhome.PlayerImpl");
        Player player = (Player) Class.forName(playerImpl).newInstance();
        System.out.print("輸入想播放的影片：");
        player.play(new Scanner(System.in).nextLine());
    }
}
