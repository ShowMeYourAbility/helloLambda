package com.llmcu;

import com.llmcu.service.*;

public class TestSimpleSyntax {
    public static void main(String[] args) {
//        1. 参数类型可以省略
//        2. 单参数时括号可以省略
//        3. 方法体只有一条语句时，花括号可以省略
//        4. 方法体只有一条return语句时，花括号和return可同时省略，且必须同时

        // 无参无返回
        NoneReturnNoneParam noneReturnNoneParam = () -> System.out.println("hello1");
        noneReturnNoneParam.test();
        // 单参无返回
        NoneReturnSingleParam noneReturnSingleParam = num -> System.out.println("hello" + num);
        noneReturnSingleParam.test(2);
        // 多参无返回
        NoneReturnMultiParam noneReturnMultiParam = (num1, num2) -> System.out.println("hello" + (num1 + num2));
        noneReturnMultiParam.test(1, 2);
        // 无参单返回
        SingleReturnNoneParam singleReturnNoneParam = () -> 4;
        System.out.println("hello" + singleReturnNoneParam.test());
        // 单参单返回
        SingleReturnSingleParam singleReturnSingleParam = num -> num / 3;
        System.out.println("hello" + singleReturnSingleParam.test(15));
        // 多参单返回
        SingleReturnMultiParam singleReturnMultiParam = (num1, num2) -> num1 * num2;
        System.out.println("hello" + singleReturnMultiParam.test(2, 3));

    }
}
