package cc.openhome;

import java.io.*;

public class FileUtil {
    public static void open(String fileName, IOConsumer<FileInputStream> consumer) {
        try(FileInputStream in = new FileInputStream(fileName)) {
            consumer.accept(in);
        } catch(IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}
