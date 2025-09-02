package MultiThreading.Recap.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100;

     Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);
        try {
            if(lock.tryLock(10000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {

                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance:" + balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance.");
                }
            }else{
                System.out.println(Thread.currentThread().getName()+" could not acquire the lock, try agan later!");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
}
