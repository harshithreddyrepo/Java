package MultiThreading.ThreadCreation.ImplementsRunnable.MultipleThreadCreation.join_and_isAlive;

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
       NewThread obj1 = new NewThread("Thread-1");
       NewThread obj2 = new NewThread("Thread-2");
       NewThread obj3 = new NewThread("Thread-3");
        System.out.println(Thread.currentThread());
        System.out.println("Thread-1 is alive:"+obj1.t.isAlive());
        System.out.println("Thread-1 is alive:"+obj2.t.isAlive());
        System.out.println("Thread-1 is alive:"+obj3.t.isAlive());
       try{
           obj1.t.join();
           obj2.t.join();
           obj3.t.join();
       }catch (InterruptedException e){
           System.out.println("Main thread Interrupted");
       }
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread:"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Thread-1 is alive:"+obj1.t.isAlive());
        System.out.println("Thread-1 is alive:"+obj2.t.isAlive());
        System.out.println("Thread-1 is alive:"+obj3.t.isAlive());
        System.out.println("Exiting the Main Thread");
    }
}

