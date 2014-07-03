package cc.openhome;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;
import static java.lang.System.*;

class ConsoleVisitor extends SimpleFileVisitor<Path> {
    private final PathMatcher matcher;
    private int matchCount = 0;

    ConsoleVisitor(String pattern) {
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
    }
    
    void search(Path file) {
        Path name = file.getFileName();
        if (name != null && matcher.matches(name)) {
            matchCount++;
            out.println(file);
        }
    }

    void done() {
        out.printf("找到 %d 檔案%n", matchCount);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        search(file);
        return CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        search(dir);
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        err.println(exc);
        return CONTINUE;
    }
}

public class Exercise {
    public static void main(String[] args) throws IOException {
        if (args.length < 3 || !args[1].equals("-name")) {
            System.err.println("java Find <path> -name \"<glob_pattern>\"");
            System.exit(-1);
        }
        Files.walkFileTree(Paths.get(args[0]), new ConsoleVisitor(args[2]));
    }
}