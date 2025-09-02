package MultiThreading.Recap.ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);
 //       Thread[] thread=new Thread[9];
        for(int i=1;i<10;i++){


//            long result = factorial(i);
//            System.out.println("Factorial of "+i+" is "+result);


           int finali=i;
           executor.submit(() -> {
               int result=factorial(finali);
               System.out.println("Factorial of "+finali+" is "+result);
           });
//           thread[i-1] = new Thread(() -> {
//               int result=factorial(finali);
//                System.out.println("Factorial of "+finali+" is "+result);
//            });
//            thread[i-1].start();
        }
   //     executor.awaitTermination(10, TimeUnit.SECONDS);
        executor.shutdown();
        try{
            while(!executor.awaitTermination(100,TimeUnit.MILLISECONDS)){
                System.out.println("Waiting...");
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

//        for(Thread t:thread){
//            t.join();
//      }
        System.out.println("Total time:"+(System.currentTimeMillis()-startTime));
   }
    public static int factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
