package HW20;

public class DataPoolTest {

    public static void main (String[] args) {

   DataPool dataPool = new DataPool();
   Producer producer = new Producer(dataPool);
   Customer customer = new Customer(dataPool);
   Thread thread1 = new Thread(producer);
   Thread thread2 = new Thread(customer);
   thread1.start();
   thread2.start();
    }
}
