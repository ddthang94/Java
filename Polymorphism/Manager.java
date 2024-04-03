package Polymorphism;

public class Manager extends Employee {
    public Manager(String name, String id, String country) {
        super(name, id, country);
    }

    public Manager(String name, String id) {
        super(name, id);
    }
    public Manager() {
    }

    @Override
    public double employeeSalary(int works) {
        return 50*works;
    }
}
