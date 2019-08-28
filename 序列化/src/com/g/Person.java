package com.g;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    //transient关键字，被修饰字段不会被序列化

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
