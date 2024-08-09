package lambdasandstreams.practicelambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args) {
        IntFunction<Integer> square = x -> x * x;

        System.out.println("square is: " + square.apply(10));

        BinaryOperator<Integer> addition = (a, b) -> a + b;

        System.out.println("addition is: " + addition.apply(10, 23));

        Function<Integer, Integer> increment = x -> x + 1;

        System.out.println("increment is: " + increment.apply(7));
    }
}
