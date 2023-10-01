package com.llmcu;

import com.llmcu.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise01ComparatorUsage {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>(5);
        userList.add(new User("a", 12));
        userList.add(new User("b", 22));
        userList.add(new User("c", 32));
        userList.add(new User("d", 19));
        userList.add(new User("e", 12));
        // 1、原始顺序
        System.out.println(userList);
        // 2、正序
        userList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(userList);
        // 3、倒序
        Collections.sort(userList, (o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(userList);
        // 4、正序
        userList = userList.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).collect(Collectors.toList());
        System.out.println(userList);
        // 5、倒序
        User[] array = userList.toArray(new User[userList.size()]);
        Arrays.sort(array, (o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(Arrays.asList(array));

    }
}
