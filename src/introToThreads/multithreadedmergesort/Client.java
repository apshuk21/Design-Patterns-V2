package introToThreads.multithreadedmergesort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> unsortedList = List.of(8, 12, 1, 5, 9, 6, 7);
        System.out.println("unsortedList is: " + unsortedList);

        ExecutorService es = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(unsortedList, es);

        Future<List<Integer>> listFuture = es.submit(sorter);

        List<Integer> result = listFuture.get();

        System.out.println("Result is: " + result);

        es.shutdown();
    }
}
