package HW20;

public class DataPool {

    private int data = 0;

    public synchronized void getData() {
        while (data < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        data--;
        System.out.println("Customer got data, data in pool: " + data);
        notify();
    }

    public synchronized void putData() {
        while (data >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        data++;
        System.out.println("Producer put data, data in pool: " + data);
    }
}
