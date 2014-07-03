package cc.openhome;

import java.io.*;

public class Exercise1 {
    public static void dump(InputStream src, OutputStream dest) throws IOException {
       try (InputStream input = src; OutputStream output = dest) {
           byte[] data = new byte[1024];
           int length = -1;
           while ((length = input.read(data)) != -1) {
              output.write(data, 0, length);
           }
       } catch (IOException ex) {
           try (PrintWriter writer = new PrintWriter(
                  new OutputStreamWriter(
                     new FileOutputStream("exception.log", true), "UTF-8"))) {
              ex.printStackTrace(writer);
           }
           throw ex;
       }
    }
}
