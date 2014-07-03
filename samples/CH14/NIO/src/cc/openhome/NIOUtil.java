package cc.openhome;

import java.io.*;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class NIOUtil {
    public static void dump(ReadableByteChannel src, 
                           WritableByteChannel dest) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try(ReadableByteChannel srcCH = src; 
                WritableByteChannel destCH = dest) {
            while(srcCH.read(buffer) != -1) {      
                buffer.flip();
                destCH.write(buffer);
                buffer.clear();
            }
        }
    }
    
    // 測試用的 main
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://openhome.cc");
        ReadableByteChannel src = Channels.newChannel(url.openStream());
        WritableByteChannel dest = 
                new FileOutputStream("index.html").getChannel();
        NIOUtil.dump(src, dest);
    }
}
