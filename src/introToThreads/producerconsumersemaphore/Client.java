package introToThreads.producerconsumersemaphore;

//import introToThreads.ProducerConsumer.Consumer;
//import introToThreads.ProducerConsumer.Producer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) {
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService es = Executors.newCachedThreadPool();

        Store store = new Store(5);

        for (int i = 0; i <= 8; i++) {
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore);
            es.execute(producer);
        }

        for (int i = 0; i <= 8; i++) {
            Consumer consumer = new Consumer(store, producerSemaphore, consumerSemaphore);
            es.execute(consumer);
        }

        es.shutdown();
    }


}
