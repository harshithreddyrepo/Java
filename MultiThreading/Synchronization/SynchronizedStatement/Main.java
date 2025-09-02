package MultiThreading.Synchronization.SynchronizedStatement;
class CallMe{
    public void call(String msg) {
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    CallMe target;
    String msg;
    Thread t;
    Caller(CallMe target, String msg){
        this.msg=msg;
        this.target=target;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        new Caller(target,"Hello");
        new Caller(target,"Synchronized");
        new Caller(target,"World");
    }
}
