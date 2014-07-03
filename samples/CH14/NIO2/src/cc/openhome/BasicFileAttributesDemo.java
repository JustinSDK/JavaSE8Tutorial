package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesDemo {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("C:\\Windows");
        BasicFileAttributes attrs = 
                Files.readAttributes(file, BasicFileAttributes.class);
        out.printf("creationTime: %s%n", attrs.creationTime());
        out.printf("lastAccessTime: %s%n",  attrs.lastAccessTime());
        out.printf("lastModifiedTime: %s%n", attrs.lastModifiedTime());
        out.printf("isDirectory: %b%n", attrs.isDirectory());
        out.printf("isOther: %b%n", attrs.isOther());
        out.printf("isRegularFile: %b%n",  attrs.isRegularFile());
        out.printf("isSymbolicLink: %b%n", attrs.isSymbolicLink());
        out.printf("size: %d%n", attrs.size());
    }
} 
