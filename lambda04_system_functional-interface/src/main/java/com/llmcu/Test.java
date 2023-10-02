package com.llmcu;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        // Predicate<T>：参数 T，返回 boolean
        Predicate<String> predicate = a -> true;
        System.out.println(predicate.test(""));


        // Consumer<T>：参数 T，返回 void
        Consumer<String> consumer = System.out::println;
        consumer.accept("true");

        // Function<T, R>：参数 T，返回 R
        Function<String, Boolean> function = a -> true;
        System.out.println(function.apply(""));

        // Supplier<T>：参数 无，返回 T
        Supplier<Boolean> supplier = () -> true;
        System.out.println(supplier.get());
// -----------------------------非抽象方法用法---------------------------------------------------
        // static <T> Predicate<T> isEqual(Object targetRef)
        // Predicate.isEqual(2)：是否等于2的预测
        System.out.println(Arrays.asList(1, 2, 3).stream().filter(Predicate.isEqual(2)::test).collect(Collectors.toList()));

        Consumer c1 = System.out::println;
        Consumer c2 = System.out::println;
        Arrays.asList(2).forEach(c1.andThen(c2));
        // 方法引用是接口实现，但一个实例是可以实现多个接口的。实例.andThen()不成立，因为andThen是哪个接口
//        Arrays.asList(2).forEach((System.out::println).andThen(System.out::println));

        Function<Integer, Integer> multiTwo = a -> Math.multiplyExact(2, a);
        Function<Integer, Integer> plusTwo = a -> Math.addExact(2, a);
        System.out.println(Arrays.asList(2).stream().map(multiTwo.andThen(plusTwo)).collect(Collectors.toList()));
        System.out.println(Arrays.asList(2).stream().map(multiTwo.compose(plusTwo)).collect(Collectors.toList()));
// -----------------------------入参有两个叫：二元、binary、bi---------------------------------------------------
        // BiPredicate<T, U> ：参数 T U，返回 boolean

        // BiConsumer<T, U> ：参数 T U，返回 void
        // BiFunction<T, U, R> ：参数 T U，返回 R
// -----------------------------入参返回类型相同叫operator---------------------------------------------------
        // UnaryOperator<T> extends Function<T, T>
        // BinaryOperator<T> extends BiFunction<T,T,T>
// -----------------------------基本数据类型---------------------------------------------------
        // IntPredicate: int -> boolean
        // LongPredicate: long -> boolean
        // DoublePredicate: double -> boolean

        // IntConsumer: int -> void
        // LongConsumer: long -> void
        // DoubleConsumer: double -> void

        // IntFunction<R>: int -> R
        // LongFunction<R>: long -> R
        // DoubleFunction<R>: double -> R
        // IntToLongFunction: int -> long
        // IntToDoubleFunction: int -> double
        // ...
        // DoubleToLongFunction: double -> long

    }
}
