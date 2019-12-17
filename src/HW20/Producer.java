package HW20;

public class Producer implements Runnable {

    DataPool dataPool;

    public Producer(DataPool dataPool) {
        this.dataPool = dataPool;
    }

    public void run() {
        for(int i = 0; i <10; i++){
            dataPool.putData();
        }
    }
}
