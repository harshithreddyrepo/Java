package MultiThreading.Recap.ExecutorsFramework.CountDownLatch;

import java.util.concurrent.*;

class DependentService implements Callable<String>{
    private CountDownLatch latch;

    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            System.out.println(Thread.currentThread().getName()+" service started.");
            Thread.sleep(2000);
        }finally {
            latch.countDown();
        }
        return "Done";
    }
}

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices=3;
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

//        System.out.println(future1.get());
//        System.out.println(future2.get());
//        System.out.println(future3.get());
        latch.await();  // Main method will wait until the countdown completes.

        System.out.println("All dependent service finished. Starting the main service...");
        executorService.shutdown();
    }
}
