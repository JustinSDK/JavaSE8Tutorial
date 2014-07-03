package cc.openhome;

import java.io.*;
import java.util.*;

public class StandardIn {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream(args[0]));
        try (Scanner file = new Scanner(System.in)) {
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        }
    }
}
