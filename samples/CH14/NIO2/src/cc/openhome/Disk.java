package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.*;
import java.text.DecimalFormat;

public class Disk {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            FileSystem fs = FileSystems.getDefault();
            for (FileStore store: fs.getFileStores()) {
                print(store);
            }
        } 
        else {
            for (String file: args) {
                FileStore store = Files.getFileStore(Paths.get(file));
                print(store);
            }
        }
    }
    
    public static void print(FileStore store) throws IOException {
        long total = store.getTotalSpace();
        long used = store.getTotalSpace() - store.getUnallocatedSpace();
        long usable = store.getUsableSpace();
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        out.println(store.toString());
        out.printf("\t- 總容量\t%s\t位元組%n", formatter.format(total));
        out.printf("\t- 可用空間\t%s\t位元組%n", formatter.format(used));
        out.printf("\t- 已用空間\t%s\t位元組%n", formatter.format(usable));
    }
}
