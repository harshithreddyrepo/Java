package MultiThreading.Synchronization.SynchronizedMethod;
class CallMe{
    synchronized public void call(String msg) {
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
    Caller(CallMe target,String msg){
        this.msg=msg;
        this.target=target;
        t=new Thread(this);
       t.start();
    }
    public void run(){
        target.call(msg);
    }
}
public class Main {
    public static void main(String[] args) {
        CallMe target  = new CallMe();
        Caller obj1 = new Caller(target,"Hello");
        Caller obj3 = new Caller(target,"World");
        Caller obj2 = new Caller(target,"Synchronized");
    }
}
