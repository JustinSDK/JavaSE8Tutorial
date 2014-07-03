package cc.openhome;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        try {
            Scanner console = new Scanner(new FileInputStream(name));
            while(console.hasNext()) {
                text.append(console.nextLine())
                    .append('\n');
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw ex;
        }
        return text.toString();
    }
}