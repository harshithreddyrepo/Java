package MultiThreading.Recap.ExecutorsFramework.AwaitTermination;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        long startTime=System.currentTimeMillis();
        for(int i=0;i<10;i++){
            int finali=i;
            executorService.submit(()->{
                System.out.println(finali+"th iteration: "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executorService.shutdown();
        try {
            //executorService.awaitTermination(10, TimeUnit.SECONDS);
            while (!executorService.awaitTermination(10,TimeUnit.MILLISECONDS)){
                System.out.println("Running...");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time taken for the completion:"+(System.currentTimeMillis()-startTime));
    }
}
