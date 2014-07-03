package cc.openhome;

import java.time.Instant;
import java.util.logging.*;

public class FormatterDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FormatterDemo.class.getName());
        logger.setLevel(Level.CONFIG);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.CONFIG);
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return "日誌來自 " + record.getSourceClassName() + "."
                                  + record.getSourceMethodName() + "\n"
                    + "\t層級\t: " + record.getLevel() + "\n" 
                    + "\t訊息\t: " + record.getMessage() + "\n"
                    + "\t時間\t: "  + Instant.ofEpochMilli(record.getMillis())
                    + "\n";
            }
        });
        logger.addHandler(handler);
        logger.config("自訂 Formatter 訊息");
    }
}
