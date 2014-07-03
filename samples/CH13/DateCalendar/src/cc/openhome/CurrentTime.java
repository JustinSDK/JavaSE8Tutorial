package cc.openhome;

import java.text.*;
import java.util.*;

public class CurrentTime {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat(
                args.length == 0 ? "EE-MM-dd-yyyy" : args[0]);  
        System.out.println(dateFormat.format(new Date())); 
    }
}
