package MultiThreading.Recap.CreatingNewThread;

public class ExtendsThread extends  Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
