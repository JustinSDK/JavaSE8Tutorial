package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        out.print("檔案位置：");
        Path file = Paths.get(console.nextLine());
        out.print("檔案編碼：");
        String encoding = console.nextLine();
        
        String html = new String(Files.readAllBytes(file), encoding);
        Pattern pattern = Pattern.compile("<a.+>(<img.+>)</a>");
        Matcher matcher = pattern.matcher(html);
        html = matcher.replaceAll("$1");
        Files.write(file, html.getBytes(encoding), StandardOpenOption.WRITE);
    }
} 
