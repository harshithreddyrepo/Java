import java.util.concurrent.*;

public class hello_world {
    public static void main(String[] args) {
       Thread t=new Thread(()->{
           for(int i=0;i<10;i++){
               System.out.println(Thread.currentThread().getName()+":"+i);
           }
       });

       t.start();
       t.start();

    }
}
