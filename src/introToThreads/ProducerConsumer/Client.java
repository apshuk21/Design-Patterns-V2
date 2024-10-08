package introToThreads.ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);

        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i <= 8; i++) {
            Producer producer = new Producer(store);
            es.execute(producer);
        }

        for (int i = 0; i <= 8; i++) {
            Consumer consumer = new Consumer(store);
            es.execute(consumer);
        }

        es.shutdown();
    }
}
