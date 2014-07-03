package cc.openhome;

import java.nio.file.*;
import static java.lang.System.out;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get(
                System.getProperty("user.home"), "Documents", "Downloads");
        out.printf("toString: %s%n", path.toString());
        out.printf("getFileName: %s%n", path.getFileName());
        out.printf("getName(0): %s%n", path.getName(0));
        out.printf("getNameCount: %d%n", path.getNameCount());
        out.printf("subpath(0,2): %s%n", path.subpath(0, 2));
        out.printf("getParent: %s%n", path.getParent());
        out.printf("getRoot: %s%n", path.getRoot());
    }
} 
