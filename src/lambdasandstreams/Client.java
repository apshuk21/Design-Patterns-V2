package lambdasandstreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(5, 10, 2, 1, 8, 6, 3, 1, 2, 2);
        List<Integer> l2 = new ArrayList<>(l1);

        System.out.println("Before sorting l2: " + l2.toString());

        Collections.sort(l2);

        System.out.println("After sorting l2: " + l2.toString());

        Stream<Integer> s1 = l1.stream();

        // forEach is a terminal operation
        // As soon as you used a terminal method, that stream can't be used anymore
        s1.forEach((item) -> System.out.println(item));

        System.out.println("********************************");

        // limit is an intermediate operation, stream will be alive
        Stream<Integer> s2 = l1.stream();

        Stream<Integer> s3 = s2.limit(2);

        // Stream is still alive
        s3.forEach((item) -> System.out.println(item + "*"));
    }
}
