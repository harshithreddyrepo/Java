package MultiThreading.Recap.Synchronisation;

public class Test {
    public static void main(String[] args) {
        Counter counter=new Counter();
        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);
        t1.start();
        t2.start();
        // ideally t1 should iterate 1000 times and t2 should iterate 1000 times
        // then the count value should be 1000+1000=2000
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount()); // Expected output:- 2000
    }
}
