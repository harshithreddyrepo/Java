package MultiThreading.ThreadCreation.ImplementsRunnable;
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"Demo Thread");
        System.out.println("Child Thread "+t);
        t.start();
    }
    @Override
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread:"+i);
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
        new NewThread();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread:"+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Exiting the Main Thread");
    }
}
