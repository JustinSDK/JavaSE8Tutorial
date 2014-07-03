package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.*;
import java.util.*;

public class Dir {
    public static void main(String[] args) throws IOException {
        try(DirectoryStream<Path> directoryStream =
                         Files.newDirectoryStream(Paths.get(args[0]))) {
            List<String> files = new ArrayList<>();
            for(Path path : directoryStream) {
                if(Files.isDirectory(path)) {
                    out.printf("[%s]%n", path.getFileName());
                } 
                else {
                    files.add(path.getFileName().toString());
                }
            }
            files.forEach(out::println);
        } 
    } 
} 
