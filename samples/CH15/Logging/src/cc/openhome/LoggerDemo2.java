package cc.openhome;

import java.util.logging.*;

public class LoggerDemo2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerDemo2.class.getName());
        logger.setLevel(Level.FINE);
        for(Handler handler : logger.getParent().getHandlers()) {
            handler.setLevel(Level.FINE);
        }
        logger.log(Level.WARNING, "WARNING 訊息");
        logger.log(Level.INFO, "INFO 訊息");
        logger.log(Level.CONFIG, "CONFIG 訊息");
        logger.log(Level.FINE, "FINE 訊息");
    }
}
