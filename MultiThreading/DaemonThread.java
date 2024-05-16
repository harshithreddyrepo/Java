package MultiThreading;

class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" User Thread");
        }
    }
}

class Thread2 extends Thread
{

    public void run()
    {
        int i=1;
        while(i<=100)
        {
            System.out.println(i+" Daemon Thread");
            i++;
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Life of the Daemon Thread depends on the life of User Threads");
        Thread1 user = new Thread1();
        Thread2 daemon = new Thread2();
        //daemon.setDaemon(true);
        daemon.start();
        user.start();
       // daemon.join();
        Thread.currentThread().join();

    }
}

// CONCLUSION : Life of the Daemon Thread depends on the life of User Threads
// Observation : This program will  do not terminate by itself.  (if the last instruction is "Thread.currentThread().join();")
    // Reason : Main thread is calling join() method hence it should terminate before the Thread in which it is called is terminated(i.e. Main Thread)
      // it is a never ending loop (:  * By the way all the daemon threads will be executed(in other words Main is waiting for other Threads to complete).