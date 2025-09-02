package MultiThreading.Recap.Synchronisation;

public class Counter {
    private int count=0;
    public void increment(){
        synchronized (this)
        {
            count++;  // critical section
        }
    }
    public int getCount(){
        return count;
    }
}
