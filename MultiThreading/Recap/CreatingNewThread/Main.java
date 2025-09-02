package MultiThreading.Recap.CreatingNewThread;

public class Main {
    public static void main(String[] args) {
        Thread thread1=new ExtendsThread();
        Thread thread2=new Thread(new ImplementsRunnable());
        thread1.start();
        thread2.start();
    }
}
