package com.llmcu;

import java.util.Arrays;
import java.util.List;

public class Exercise03ForEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        // forEach用法
        list.forEach(System.out::println);
        // 只输出偶数
        list.forEach(ele -> {
            if (ele % 2 == 0) {
                System.out.println(ele);
            }
        });

    }
}
