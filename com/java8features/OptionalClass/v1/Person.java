package com.java8features.OptionalClass.v1;

import java.util.Optional;

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
//        throw NullPointerException when return null
    }
    public static void main(String[] args) {
        Person person = Person.findById(1);
        // cách xử lý thông thường
        //if (person != null) {
        //   System.out.println(person.getName());
        //}

        // cách xử lý với Optional Class
        // dùng ofNullable vì đối person có thể null
        Optional<Person> optionalPerson = Optional.ofNullable(person);
        // ifPresent: kiểm tra đối tượng bên trong optional có khác null không
        optionalPerson.ifPresent(p -> System.out.println(p.getName()));
    }
}
