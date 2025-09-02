package MultiThreading.InterThreadCommunication;
class Q{
    int n;
    boolean valueSet=false;
    synchronized public void put(int n){
        while(valueSet==true){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println("put:"+n);
        valueSet=true;
        notify();
    }
   synchronized public int get(){
        while (valueSet==false){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Got:"+n);
        valueSet=false;
        notify();
        return n;
    }
}
class Producer implements Runnable{
    Q target;
    Thread t;
    Producer(Q target){
        this.target = target;
        t = new Thread(this);
        t.start();
    }
    int i=0;
    @Override
    public void run() {
        while (true){
            target.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Q target;
    Thread t;
    Consumer(Q target){
        this.target = target;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        while (true){
            target.get();
        }
    }
}
public class Main {
    public static void main(String[] args) {
       Q target = new Q();

       new Consumer(target);
        new Producer(target);
    }
}
