package MultiThreading;

public class Program2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println(i +" Hello");
        }
    }

    public static void main(String[] args) {
        System.out.println("we can achieve MultiThreading with the help of 'Runnable interface' also");
        System.out.println("Runnable interface consist only one abstract method that is 'public void run()'");
        Program2 obj = new Program2();  // We can have reference of Runnable for this object...
        System.out.println("We should pass the object as parameter for the constructor of Thread class");
        Thread MyThread = new Thread(obj);
        MyThread.start();

        for(int i=0;i<10;i++)
        {
            System.out.println(i + " World");
        }
    }
}
