package cc.openhome;

import java.io.IOException;
import java.util.logging.*;

public class HandlerDemo {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(HandlerDemo.class.getName());
        logger.setLevel(Level.CONFIG);
        FileHandler handler = new FileHandler("%h/config.log");
        handler.setLevel(Level.CONFIG);
        logger.addHandler(handler);
        logger.config("Logger 組態完成");
    }
}
