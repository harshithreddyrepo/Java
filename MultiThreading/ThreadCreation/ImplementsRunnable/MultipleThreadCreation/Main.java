package MultiThreading.ThreadCreation.ImplementsRunnable.MultipleThreadCreation;
class NewThread implements Runnable{
    Thread t;
    NewThread(String threadName){
        t=new Thread(this,threadName);
        System.out.println("Child Thread:"+t);
        System.out.println(t.getName());
        t.start();
    }
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Child Thread interrupted");
        }
        System.out.println("Exiting the Child Thread");
    }
}
public class Main {
    public static void main(String[] args) {
        new NewThread("Thread-1");
        new NewThread("Thread-2");
        new NewThread("Thread-3");
        new NewThread("Thread-4");
        System.out.println(Thread.currentThread());
            try{
                for(int i=5;i>0;i--){
                    System.out.println("Main Thread:"+i);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                System.out.println("Main Thread interrupted");
            }
            System.out.println("Exiting the Main Thread");
    }
}
