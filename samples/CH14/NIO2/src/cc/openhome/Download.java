package cc.openhome;

import java.io.*;
import java.net.URL;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.*;

public class Download {
    public static void main(String[] args) throws IOException {
        URL url = new URL(args[0]);
        Files.copy(url.openStream(), Paths.get(args[1]), REPLACE_EXISTING);
    }
}
