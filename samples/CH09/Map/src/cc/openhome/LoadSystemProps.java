package cc.openhome;

import java.util.Properties;

public class LoadSystemProps {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
    }
}
