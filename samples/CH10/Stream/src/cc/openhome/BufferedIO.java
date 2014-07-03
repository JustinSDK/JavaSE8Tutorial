package cc.openhome;

import java.io.*;

public class BufferedIO {
    public static void dump(InputStream src, OutputStream dest)
                              throws IOException {
        try(InputStream input = new BufferedInputStream(src);
             OutputStream output = new BufferedOutputStream(dest)) {
            byte[] data = new byte[1024];
            int length;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}
