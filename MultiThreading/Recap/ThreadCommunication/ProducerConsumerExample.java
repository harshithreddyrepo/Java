package MultiThreading.Recap.ThreadCommunication;

class SharedResource{
    private int data;
    private boolean hasData=false;
    int j=0;
    public synchronized void produce(int value){
        System.out.println("calling produce() for "+ ++j +"th time");
        while(hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Producer produced:"+value);
        data=value;
        hasData=true;
        notify();
    }
      int i=0;
    public synchronized int consume(){
        System.out.println("calling consume() for "+ ++i +"th time");
        while(!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumer consumed:"+data);
        hasData=false;
        notify();
        return  data;

    }
}

class Producer implements Runnable{

    private SharedResource resource;
    Producer(SharedResource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
       for(int i=0;i<10;i++){
           resource.produce(i);
          // System.out.println("Produced: "+i);
       }
    }
}

class Consumer implements Runnable{

    private SharedResource resource;
    Consumer(SharedResource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
      for(int i=0;i<10;i++){
          int value=resource.consume();
      }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
