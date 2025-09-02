package MultiThreading.Recap.ThreadMethods;
class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            String a="";
            for(int j=0;j<10000;j++){
                a+="a";
            }
            System.out.println(Thread.currentThread().getName()+"-Priority:"+Thread.currentThread().getPriority()+":"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
         MyThread l=new MyThread("Low Priority Thread");
         MyThread m=new MyThread("Medium Priority Thread");
         MyThread h=new MyThread("High Priority Thread");
         l.setPriority(Thread.MIN_PRIORITY);
         m.setPriority(Thread.NORM_PRIORITY);
         h.setPriority(Thread.MAX_PRIORITY);
         l.start();
         m.start();
         h.start();
//         l.setPriority(Thread.MAX_PRIORITY);
//         m.setPriority(Thread.MIN_PRIORITY);
//         h.setPriority(Thread.NORM_PRIORITY);
    }
}
