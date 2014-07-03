package cc.openhome;

import java.io.IOException;
import static java.lang.System.*;
import java.nio.file.*;
import static java.nio.file.FileVisitResult.*;
import java.nio.file.attribute.*;

public class ConsoleFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path path, 
                           BasicFileAttributes attrs) throws IOException {
        printSpace(path);
        out.printf("[%s]%n", path.getFileName());
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attr) {
        printSpace(path);
        out.printf("%s%n", path.getFileName());
        return CONTINUE;
    }
    
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        err.println(exc);
        return CONTINUE;
    }

    private void printSpace(Path path) {
         out.printf("%" + path.getNameCount() * 2 + "s", "");
    }
}
