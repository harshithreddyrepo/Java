package MultiThreading.Recap.ExecutorsFramework.ScheduledThreadPoolExecutor;
import java.util.concurrent.*;
public class Main {
    public static void main(String[] args) {
        /*
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Task executed after 5 seconds!");

        long startTime=System.currentTimeMillis();

        scheduler.schedule(task, 5, TimeUnit.SECONDS); // Execute task after 5 sec

        scheduler.shutdown(); // Shutdown the scheduler after execution

         */
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Task executed at: " + System.currentTimeMillis());

        scheduler.scheduleAtFixedRate(task, 2, 3, TimeUnit.SECONDS); // Start after 2s, then repeat every 3s


       // scheduler.shutdown();


    }
}





