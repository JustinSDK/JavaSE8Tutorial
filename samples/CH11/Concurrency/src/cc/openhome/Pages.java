package cc.openhome;

import java.net.URL;
import java.util.concurrent.*;
import java.io.*;

public class Pages {
    private URL[] urls;
    private String[] fileNames;
    private Executor executor;

    public Pages(URL[] urls, String[] fileNames, Executor executor) {
        this.urls = urls;
        this.fileNames = fileNames;
        this.executor = executor;
    }

    public void download() {
        for (int i = 0; i < urls.length; i++) {
            URL url = urls[i];
            String fileName = fileNames[i];
            executor.execute(() -> {
                try {
                    dump(url.openStream(), new FileOutputStream(fileName));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
        }
    }

    private void dump(InputStream src, OutputStream dest) throws IOException {
        try (InputStream input = src; OutputStream output = dest) {
            byte[] data = new byte[1024];
            int length;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}
