package MultiThreading.Recap.Lock;

import MultiThreading.Recap.Synchronisation.Counter;
import MultiThreading.Recap.Synchronisation.MyThread;

public class Test {
    public static void main(String[] args) {
       BankAccount bankAccount=new BankAccount();
       ReentrantExample reentrantLock=new ReentrantExample();
       Thread t1=new Thread(new Runnable() {
           @Override
           public void run() {
             //  bankAccount.withdraw(50);
               reentrantLock.outerMethod();

           }
       });
//        Thread t2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                bankAccount.withdraw(50);
//            }
//        });
        //t1.start();
 //       t2.start();
        t1.start();

    }
}
