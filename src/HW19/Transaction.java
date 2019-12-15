package HW19;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class Transaction {

    public static void main (String[] args)throws InterruptedException {
        Account thread1 = new Account("thread1");
        Account thread2= new Account("thread2");

        thread2.setPriority(MAX_PRIORITY);
        thread1.setPriority(MIN_PRIORITY);
        thread2.start();
        Thread.sleep(1000);
        thread1.start();
    }
    }
