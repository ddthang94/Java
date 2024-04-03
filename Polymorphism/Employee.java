package Polymorphism;

public abstract class Employee {
    /* add attributes */
    private String name;
    private String id;
    private String country;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public Employee(String name, String id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Employee() {
    }

    public abstract double employeeSalary(int works);
}