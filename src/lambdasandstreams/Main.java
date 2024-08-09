package lambdasandstreams;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream methods
 * forEach(Consumer: FunctionalInterface) -> Terminal
 * limit -> Intermediate
 * filter(Predicate: FunctionalInterface) -> Intermediate
 * collect(Collectors.toList() -> Terminal, and returns a collection
 * map -> Intermediate
 * distinct -> Intermediate
 * sorted(Comparator: FunctionalInterface) -> Intermediate
 * findFirst -> Terminal, but returns an Optional
 * count -> Terminal
 * reduce -> Terminal
 * flatMap -> Intermediate
 */

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("akash", 23);
        Student s2 = new Student("aviral", 45);
        Student s3 = new Student("john", 20);

        List<Student> studentList = new ArrayList<>(List.of(s1, s2, s3));

        List<Student> studentList2 = List.of(s1, s2, s3);

        List<Integer> intList = List.of(5, 10, 2, 1, 16, 3, 2, 3, 8, 1, 2, 2);

        System.out.println("Students list before sorting: " + studentList.toString());

//        Comparator<Student> studentComparator = new StudentComparator();


        Comparator<Student> studentComparator1 = (Student st1, Student st2) -> st1.getPsp() - st2.getPsp();

        Collections.sort(studentList, studentComparator1);

        System.out.println("Students list after sorting1: " + studentList.toString());

        Stream<Student> studentStream = studentList2.stream();

//        studentStream.filter((student) -> {
//            return student.getPsp() > 20;
//        }).forEach(student -> System.out.println("Filtered Student: " + student));

        // Use of collect
        List<Student> l3 = studentStream.filter((student) -> {
            return student.getPsp() > 20;
        }).collect(Collectors.toList());

        System.out.println("l3 is: " + l3);
        System.out.println("**************************");

        // Use of Map
        Stream<Student> studentStream2 = studentList2.stream();

        List<Student> l4 = studentStream2.filter((student) -> {
            return student.getPsp() > 20;
        }).map(student -> student).collect(Collectors.toList());

        System.out.println("l4 is: " + l4);
        System.out.println("**************************");

        Stream<Integer> s4 = intList.stream();

        List<Integer> l5 = s4.distinct().sorted((a, b) -> b - a).collect(Collectors.toList());

        System.out.println("l5 is: " + l5);
        System.out.println("**************************");

        // Find First
        Stream<Integer> s5 = intList.stream();

        Optional<Integer> firstInt = s5.distinct().sorted((a, b) -> b - a).findFirst();

        if (firstInt.isPresent()) {
            System.out.println("firstInt is: " + firstInt.get());
        }
        System.out.println("**************************");

        // find sum of a list

        // Flat Map

        // Given a 2-D list. Goal is to convert it to a 1-D list
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4,5),
                Arrays.asList(6, 7, 8)
        );

        Stream<List<Integer>> streamOfLists = listOfLists.stream();

        List<Integer> finalList = streamOfLists.flatMap(elem -> elem.stream()).collect(Collectors.toList());

        System.out.println("finalList is: " + finalList);
        System.out.println("**************************");
    }
}
