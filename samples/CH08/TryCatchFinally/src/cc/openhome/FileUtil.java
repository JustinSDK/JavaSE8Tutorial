package cc.openhome;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        Scanner console = null;
        try {
            console = new Scanner(new FileInputStream(name));
            while (console.hasNext()) {
                text.append(console.nextLine())
                   .append('\n');
            }
        } finally {
            if(console != null) {
                console.close();
            }
        }
        return text.toString();
    }
}