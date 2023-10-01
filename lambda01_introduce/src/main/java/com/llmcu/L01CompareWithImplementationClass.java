package com.llmcu;

public class L01CompareWithImplementationClass {

    public static void main(String[] args) {
        // 1、使用接口实现类
        Comparator myComparator = new MyComparator();
        myComparator.compare(9,4);
        // 2、使用匿名内部类实现接口
        Comparator myAnonymousComparator = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a-b;
            }
        };
        myAnonymousComparator.compare(9,4);
        // 3、使用lambda表达式实现接口
        Comparator myLambda = (a,b)->a-b;
        myLambda.compare(9,4);

    }

}
class MyComparator implements Comparator {
    @Override
    public int compare(int a, int b) {
        return a-b;
    }
}
@FunctionalInterface
interface Comparator {
    int compare(int a,int b);

    // 默认方法必须要有方法体
    default int compare2(int a, int b) {
        return 0;
    }
}
