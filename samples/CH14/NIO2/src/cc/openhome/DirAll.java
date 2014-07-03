package cc.openhome;

import java.io.IOException;
import java.nio.file.*;

public class DirAll {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get(args[0]), new ConsoleFileVisitor());
    }
}
