package cc.openhome;

import java.util.*;
import static java.lang.System.out;

public class Messages {
    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>();
        messages.put("Justin", "Hello！Justin的訊息！");
        messages.put("Monica", "給Monica的悄悄話！");
        messages.put("Irene", "Irene的可愛貓喵喵叫！");
        
        Scanner console = new Scanner(System.in);
        out.print("取得誰的訊息：");
        String message = messages.get(console.nextLine());
        out.println(message);
        out.println(messages);
    }
}
