package MultiThreading;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);  // setting name through constructor
    }

    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i);
            i++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("thread is interrupted");
            }
        }
    }

}


public class Interrupt {
    public static void main(String[] args) {
        System.out.println("sleep() method is static method");
        // we should keep the sleep method inside try block because it may raise InterruptedException
        MyThread1 thread = new MyThread1("First thread");

            thread.start();

        thread.interrupt();

    }
}
