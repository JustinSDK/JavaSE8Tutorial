package cc.openhome;

import java.util.*;
import static java.lang.System.out;

public class Guest {
    public static void main(String[] args) {
        List names = new java.util.ArrayList();
        collectNameTo(names);
        out.println("訪客名單：");
        printUpperCase(names); 
    }

    static void collectNameTo(List names) {
        Scanner console = new Scanner(System.in);
        while(true) {
            out.print("訪客名稱：");
            String name = console.nextLine();
            if(name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }

    static void printUpperCase(List names) {
        for(int i = 0; i < names.size(); i++) {
            String name = (String) names.get(i);
            out.println(name.toUpperCase());
        }        
    }
}
