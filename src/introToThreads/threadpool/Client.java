package introToThreads.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            es.execute(np);
        }

        es.shutdown();
    }
}
