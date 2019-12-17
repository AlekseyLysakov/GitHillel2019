package HW20;

public class Customer implements Runnable {

    DataPool dataPool;

    public Customer(DataPool dataPool) {
        this.dataPool = dataPool;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            dataPool.getData();
        }
    }
}
