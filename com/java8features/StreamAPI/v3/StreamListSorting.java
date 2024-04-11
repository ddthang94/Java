package com.java8features.StreamAPI.v3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Grape");

        /* Using StreamAPI to sort the list: increment */
        List<String> sortedList = fruits.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(sortedList);

        /* Using StreamAPI with Lambda expression */
        List<String> sortedList2 = fruits.stream().sorted((o1, o2)-> o1.compareTo(o2)).toList();
        System.out.println(sortedList2);

        /* Using StreamAPI with Method reference */
        List<String> sortedList3 = fruits.stream().sorted(String::compareTo).toList();
        System.out.println(sortedList3);

        /* Default sorting method */
        List<String> sortedList4 = fruits.stream().sorted().toList();
        System.out.println(sortedList4);
        System.out.println("======================");

        /* Using StreamAPI to sort the list: decrement */
        List<String> sortedList5 = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedList5);

        /* Using StreamAPI with Lambda expression */
        List<String> sortedList6 = fruits.stream().sorted((o1, o2)-> o2.compareTo(o1)).toList();
        System.out.println(sortedList6);

//        have class Employee
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 30, 1599.0));
        employees.add(new Employee(2, "Jane", 36, 1399.0));
        employees.add(new Employee(3, "Jack", 20, 1200.0));
        employees.add(new Employee(4, "Bob", 29, 2999.0));

        /* Using streamAPI with Lambda expression to sort the list of employee by salary */
//        default: ascending
        List<Employee> employeeSortedList = employees.stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .toList();
        System.out.println(employeeSortedList);
//        descending: replace o2 by o1 from lambda expression
        List<Employee> employeeSortedList2 = employees.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .toList();
        System.out.println(employeeSortedList2);

        /* Using streamAPI with Method Reference to sort the list of employee by Age */
        System.out.println("Age");
        List<Employee> employeeSortedList3 = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getAge))
                .toList();
        System.out.println(employeeSortedList3);
//      descending
        List<Employee> employeeSortedList4 = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getAge).reversed())
                .toList();
        System.out.println(employeeSortedList4);

        /* Using streamAPI with Method Reference to sort the list of employee by Name */
        System.out.println("Name");
        List<Employee> employeeSortedList5 = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();
        System.out.println(employeeSortedList5);

        List<Employee> employeeSortedList6 = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .toList();
        System.out.println(employeeSortedList6);
    }
}
