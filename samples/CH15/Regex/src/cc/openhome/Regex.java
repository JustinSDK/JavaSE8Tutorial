package cc.openhome;

import static java.lang.System.out;
import java.util.*;
import java.util.regex.*;

public class Regex {    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            out.print("輸入規則表示式：");
            String regex = console.nextLine();
            out.print("輸入要比對的文字：");
            String text = console.nextLine();
            print(match(regex, text));
        } catch(PatternSyntaxException ex) {
                out.println("規則表示式有誤");
                out.println(ex.getMessage());
        }
    }

    private static List<String> match(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> matched = new ArrayList<>();
        while(matcher.find()) {
            matched.add(String.format(
                    "從索引 %d 開始到索引 %d 之間找到符合文字 \"%s\"%n",
                    matcher.start(), matcher.end(), matcher.group()));
        }
        return matched;
    }
    
     private static void print(List<String> matched) {
        if(matched.isEmpty()){
            out.println("找不到符合文字");
        }
        else {
            matched.forEach(out::println);
        }
    }
} 
