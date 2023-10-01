package com.llmcu;

import com.llmcu.service.*;

public class TestBasicSyntax {
    public static void main(String[] args) {
        // lambda表达式是一个匿名函数
        // （返回结果、抽象方法名）、入参、方法体

        // ()：用来描述参数列表
        // {}：用来描述方法体
        // ->：箭头符号、lambda运算符，读作goes to

        // 无参无返回
        NoneReturnNoneParam noneReturnNoneParam = () -> {
            System.out.println("hello1");
        };
        noneReturnNoneParam.test();
        // 单参无返回
        NoneReturnSingleParam noneReturnSingleParam = (int num) -> {
            System.out.println("hello" + num);
        };
        noneReturnSingleParam.test(2);
        // 多参无返回
        NoneReturnMultiParam noneReturnMultiParam = (int num1, int num2) -> {
            System.out.println("hello" + (num1 + num2));
        };
        noneReturnMultiParam.test(1, 2);
        // 无参单返回
        SingleReturnNoneParam singleReturnNoneParam = () -> {
            return 4;
        };
        System.out.println("hello" + singleReturnNoneParam.test());
        // 单参单返回
        SingleReturnSingleParam singleReturnSingleParam = (int num) -> {
            return num / 3;
        };
        System.out.println("hello" + singleReturnSingleParam.test(15));
        // 多参单返回
        SingleReturnMultiParam singleReturnMultiParam = (int num1, int num2) -> {
            return num1 * num2;
        };
        System.out.println("hello" + singleReturnMultiParam.test(2, 3));

    }
}
