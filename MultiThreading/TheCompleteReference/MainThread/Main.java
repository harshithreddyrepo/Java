package MultiThreading.TheCompleteReference.MainThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("The main thread has been started!");
        Thread t =Thread.currentThread();  //Returns the reference to the Thread in which it is called.
        System.out.println("let's keep the thread in sleep state for 5 sec!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Default name of the Main Thread:"+t.getName());
        System.out.println("Modify the name of the thread to 'MAIN_Thread'");
        t.setName("MAIN_Thread");
        System.out.println("New name of the thread is:"+t.getName());
    }
}
