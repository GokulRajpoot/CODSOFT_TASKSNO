package com.codsoft;

import java.util.Scanner;
import java.util.concurrent.*;

public class TimedInputReader implements AutoCloseable {
    private final Scanner scanner = new Scanner(System.in);
    private final ExecutorService executor = Executors.newSingleThreadExecutor(r -> {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    });

    public String read(int seconds)
            throws TimeoutException, InterruptedException, ExecutionException {
        Future<String> future = executor.submit(scanner::nextLine);
        return future.get(seconds, TimeUnit.SECONDS).trim().toUpperCase();
    }

    @Override
    public void close() {
        executor.shutdownNow();
        scanner.close();
    }
}
