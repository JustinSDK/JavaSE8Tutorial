package cc.openhome;

import java.util.logging.*;

public class LoggerDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerDemo.class.getName());
        logger.log(Level.WARNING, "WARNING 訊息");
        logger.log(Level.INFO, "INFO 訊息");
        logger.log(Level.CONFIG, "CONFIG 訊息");
        logger.log(Level.FINE, "FINE 訊息");
    }
}
