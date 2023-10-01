package com.llmcu;

import java.util.function.Supplier;

public class TestClosure {
    public static void main(String[] args) {
        // getNumberGenerator方法都调用完了，理论上此方法内部的局部变量就会销毁
        // 但闭包增加了此变量的生命周期
        Integer integer = getNumberGenerator().get();
        System.out.println(integer);
    }

    private static Supplier<Integer> getNumberGenerator() {
        // 所谓effectively final(实际上不可改变),即lambda表达式内部使用的外部变量，即使没被final修饰，实际上也当它被final修饰
        int num = 10;
        // variable used in lambda expression should be final or effectively final
//        num++;
        // 闭包：lambda表达式包裹了外部局部变量
        return () -> num;
    }
}
