package com.example.restapitest.dto;

public class UserObjectMapper {

    private String name;
    private int age;

    public UserObjectMapper() {
    }

    public UserObjectMapper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserObjectMapper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
