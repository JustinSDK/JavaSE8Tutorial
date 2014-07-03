package cc.openhome;

import java.io.*;

public class Exercise2 {
    public static void dump(Reader src, Writer dest) throws IOException {
        try(Reader input = src; Writer output = dest) {
            char[] data = new char[1024];
            int length = 0;
            while((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }

    public static void main(String[] args) {
        try {
            String srcEncoding = args[0];
            String srcName = args[1];
            String destName = args[2];
            dump(new InputStreamReader(new FileInputStream(srcName), srcEncoding),
                 new OutputStreamWriter(new FileOutputStream(destName), "UTF-8"));
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("要指定引數：srcEncoding srcName destName");
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
