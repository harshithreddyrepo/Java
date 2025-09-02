package MultiThreading.Recap.ExecutorsFramework.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        CompletableFuture<String> worker = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (Exception e) {

            }
            return "ok";
        });

        try {
            System.out.println(worker.get());
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main");
    }
}
