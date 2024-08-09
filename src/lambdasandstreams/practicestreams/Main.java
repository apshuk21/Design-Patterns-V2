package lambdasandstreams.practicestreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "apple", "kiwi");
        Stream<String> fruitStream = fruits.stream();

        String result = fruitStream.collect(Collectors.joining(", "));

        System.out.println("result is: " + result);

        System.out.println("***********************");

        Stream<String> fruitStream2 = fruits.stream();

        Map<Integer, List<String>> groupedByLength = fruitStream2.collect(Collectors.groupingBy(String::length));

        System.out.println("groupedByLength is: " + groupedByLength);

        System.out.println("***********************");

        Stream<String> fruitStream3 = fruits.stream();

        Set<String> setOfFruits = fruitStream3.collect(Collectors.toSet());

        System.out.println("setOfFruits is: " + setOfFruits + " " + setOfFruits.getClass().getName());

        System.out.println("***********************");

        Stream<String> fruitStream4 = fruits.parallelStream();

        boolean allMatchResult = fruitStream4.allMatch(word -> word.length() > 5);

        System.out.println("allMatchResult is: " + allMatchResult);

        System.out.println("***********************");

//        List<String> output = fruits.stream().map(String::toUpperCase).distinct().forEach(System.out::println);
    }
}
