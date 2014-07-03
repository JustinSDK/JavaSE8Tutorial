package cc.openhome;

import java.io.*;
import static java.lang.System.out;
import java.nio.file.*;
import java.util.concurrent.*;

public class Async {

    public static CompletableFuture<String> readFileAsync(String file, ExecutorService service) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return new String(Files.readAllBytes(Paths.get(file)));
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }, service);
    }

    public static CompletableFuture<String> processContentAsync(String content, ExecutorService service) {
        return null;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService poolService = Executors.newFixedThreadPool(10);

        readFileAsync(args[0], poolService).whenComplete((ok, ex) -> {
            if(ex == null) {
                out.println(ok);
            } else {
                ex.printStackTrace();
            }
        }).join();

        poolService.shutdown();
    }
}
