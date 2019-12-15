package HW19;

import java.sql.SQLOutput;

public class Account extends Thread {

    private int balance = 50;

    public Account(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            getMoneyFromAccount(10);
            if (getBalance() < 0) {
                System.out.println("Your Account is empty");
            }
            giveMoneyToAccount(15);
        }
    }

    public int getBalance() {
        return balance;
    }

    public void getMoney(int amount) {
        balance -= amount;
    }

    private synchronized void giveMoneyToAccount(int amount) {
        System.out.println(Thread.currentThread().getName() + " give money to Account: " + amount);
        balance += amount;
        System.out.println("Current balance is " + getBalance());
        System.out.println();
    }


    private synchronized void getMoneyFromAccount(int amount) {
        if (getBalance() >= amount) {
            getMoney(amount);
            System.out.println(Thread.currentThread().getName() + " get money from Account: " + amount);
            System.out.println("Current balance is " + getBalance());
            System.out.println();
        } else {
            System.out.println("not enough money on Account for " + Thread.currentThread().getName());
        }
    }


}
