package com.llmcu;

import com.llmcu.entity.User;

import java.util.*;

public class Exercise02TreeSet {
    public static void main(String[] args) {
//        Set<User> treeSet = new TreeSet<>((o1,o2)->{return o1.getAge()-o2.getAge();});
//        Set<User> treeSet = new TreeSet<>(Comparator.comparingInt(User::getAge));
        Set<User> treeSet = new TreeSet<>((o1,o2)->o1.getAge()>o2.getAge()?1:-1);
        treeSet.add(new User("a", 12));
        treeSet.add(new User("b", 22));
        treeSet.add(new User("c", 32));
        treeSet.add(new User("d", 19));
        treeSet.add(new User("e", 12));
        // 1、原始顺序
        System.out.println(treeSet);


    }
}
