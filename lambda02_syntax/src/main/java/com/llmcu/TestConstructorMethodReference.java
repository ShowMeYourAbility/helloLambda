package com.llmcu;

public class TestConstructorMethodReference {
    public static void main(String[] args) {
        PersonCreator personCreator = Person::new;
        Person mimi = personCreator.createPerson("mimi", 35);
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("无参构造方法被执行...");
    }

    public Person(String name, int age) {
        System.out.println("有参构造方法被执行...");
        this.name = name;
        this.age = age;
    }
}

@FunctionalInterface
interface PersonCreator {
    Person createPerson(String name, int age);
}