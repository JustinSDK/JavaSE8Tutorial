package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws IOException {
        String html = new String(Files.readAllBytes(Paths.get("c:\\workspace\\EssentialJavaScript-1.html")), "UTF-8");
        // <a .+?><img .+?></a>
        Pattern pattern = Pattern.compile("<a .+?>(<img .+?>)</a>");
        Matcher matcher = pattern.matcher(html);
        matcher = Pattern.compile("(<img .+?>)").matcher(matcher.replaceAll("$1"));
        while(matcher.find()) {
            out.println(matcher.group());
        }
    }
} 
