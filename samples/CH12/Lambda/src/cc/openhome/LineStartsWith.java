package cc.openhome;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class LineStartsWith {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        String prefix = args[1];
        Optional<String> firstMatchdLine = 
                Files.lines(Paths.get(fileName))
                    .filter(line -> line.startsWith(prefix))
                    .findFirst();
        System.out.println(firstMatchdLine.orElse("no matched line"));
    }
}
