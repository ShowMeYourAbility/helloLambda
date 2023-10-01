package com.llmcu;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        // Predicate<T>：参数 T，返回 boolean
        Predicate<String> predicate = a -> true;
        System.out.println(predicate.test(""));

        // Consumer<T>：参数 T，返回 void
        Consumer<String> consumer = System.out::println;
        consumer.accept("true");

        // static <T> Predicate<T> isEqual(Object targetRef)
        System.out.println(Arrays.asList(1, 2, 3).stream().filter(Predicate.isEqual(2)::test).collect(Collectors.toList()));

    }
}
