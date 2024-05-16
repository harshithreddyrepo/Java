package MultiThreading;
public class Program1 extends Thread {

    public void run()  // public void run() method should be overridden.
    {
        int i = 1;
        while(true) {
            System.out.println(i++ +" Hello");
        }
    }

    static void display()
    {
        int i = 1;
        while (true)
        {
            System.out.println(i++ +" World");
        }
    }

    public static void main(String[] args) {
        System.out.println("Thread class contains the mechanism to achieve MultiThreading");
        System.out.println("Here after completion of execution of show method, display  method is invoked due to control flow of the program");
        System.out.println("but we know the execution of show program does not terminates since it is an infinite loop");
        System.out.println("for the simultaneous execution of both the programs 'Threads' concept is used");
        Program1 obj = new Program1();
        obj.start();  //start() is an inbuilt method of Thread class it will invoke run() method.
                  // within the start() method the run() method will be  invoked.

        display();
    }

}
