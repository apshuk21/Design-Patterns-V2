package introToThreads.multithreadedmergesort;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;
    ExecutorService executor;

    public Sorter(List<Integer> arrayToSort, ExecutorService executor) {
        this.arrayToSort = arrayToSort;
        this.executor = executor;
    }

    public List<Integer> call() throws Exception {
        List<Integer> sortedArray = new ArrayList<>();
        try {
            if (arrayToSort.size() == 1) {
                return arrayToSort;
            }

            int mid = arrayToSort.size() / 2;
            List<Integer> leftArray = new ArrayList<>();
            List<Integer> rightArray = new ArrayList<>();

            for (int i = 0; i < mid; i++) {
                leftArray.add(arrayToSort.get(i));
            }

            for (int i = mid; i < arrayToSort.size(); i++) {
                rightArray.add(arrayToSort.get(i));
            }

            Sorter leftArraySorter = new Sorter(leftArray, this.executor);
            Sorter rightArraySorter = new Sorter(rightArray, this.executor);

            // Runnable interface - es.execute()
            // Callable interface -> es.submit()

//            ExecutorService es = Executors.newFixedThreadPool(2);

            Future<List<Integer>> leftFuture = this.executor.submit(leftArraySorter);
            Future<List<Integer>> rightFuture = this.executor.submit(rightArraySorter);

            List<Integer> sortedLeftArray = leftFuture.get();
            List<Integer> sortedRightArray = rightFuture.get();

            // merge : wait for the sorted arrays

            int i= 0;
            int j = 0;



            while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
                if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                    sortedArray.add(sortedLeftArray.get(i));
                    i += 1;
                } else {
                    sortedArray.add(sortedRightArray.get(j));
                    j += 1;
                }
            }

            while (i < sortedLeftArray.size()) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            }

            while (j < sortedRightArray.size()) {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sortedArray;
    }
}
