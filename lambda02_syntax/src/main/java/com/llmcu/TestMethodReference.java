package com.llmcu;

import com.llmcu.service.SingleReturnMultiParam;

public class TestMethodReference {
    public static void main(String[] args) {
        SingleReturnMultiParam singleReturnMultiParam = TestMethodReference::multi;
        System.out.println(singleReturnMultiParam.test(4, 3));
    }

    static int multi(int num1, int num2) {
        return num1 * num2;
    }
}
