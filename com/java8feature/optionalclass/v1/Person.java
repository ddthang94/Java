package com.java8feature.optionalclass.v1;

public class Person {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static Person findById(int id) {
        //do something
        return null;
//        If method findById return null then throw NullPointerException;
    }
    public static void main(String[] args) {
        Person person = Person.findById(1);
        System.out.println(person.getName());
    }
}
