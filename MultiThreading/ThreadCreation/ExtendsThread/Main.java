package MultiThreading.ThreadCreation.ExtendsThread;
class Newthread extends Thread{
    Newthread(){
        super("Demo thread");
        System.out.println("Child Thread : "+this);
        start();
    }
    public void run(){
        try {
            for(int i=5;i>0;i--){
                System.out.println("Child thread:"+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Thread interrupted");
        }
        System.out.println("Exiting the Child Thread");
    }
}
public class Main {
    public static void main(String[] args) {
       new Newthread();
        try {
            for(int i=5;i>0;i--){
                System.out.println("Main thread:"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Exiting the Main Thread");
    }
}
