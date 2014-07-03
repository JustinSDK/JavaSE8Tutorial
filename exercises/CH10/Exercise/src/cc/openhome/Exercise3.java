package cc.openhome;

import java.util.Scanner;
import static cc.openhome.FileUtil.open;

public class Exercise3 {
    public static void main(String[] args) {
        open(args[0], fileInputStream -> {
            Scanner file = new Scanner(fileInputStream);
            while(file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        });
    }
}
