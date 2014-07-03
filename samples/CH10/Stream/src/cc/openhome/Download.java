package cc.openhome;

import java.io.*;
import java.net.URL;

public class Download {
    public static void main(String[] args) throws IOException {
        URL url = new URL(args[0]);
        InputStream src = url.openStream();
        OutputStream dest = new FileOutputStream(args[1]);
        IO.dump(src, dest);
    }
}
