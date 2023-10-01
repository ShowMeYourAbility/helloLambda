package com.llmcu;

import com.llmcu.entity.User;

import java.util.ArrayList;
import java.util.List;

public class Exercise04RemoveIf {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>(5);
        userList.add(new User("a", 12));
        userList.add(new User("b", 22));
        userList.add(new User("c", 32));
        userList.add(new User("d", 19));
        userList.add(new User("e", 12));
        // 1、原始顺序
        System.out.println(userList);
        // 2、removeIf处理后
        userList.removeIf(ele -> ele.getAge() >= 20);
        System.out.println(userList);
    }
}
