package Polymorphism;

public class Boss extends Employee {
    public Boss(String name, String id, String country) {
        super(name, id, country);
    }

    public Boss(String name, String id) {
        super(name, id);
    }

    public Boss() {
    }

    @Override
    public double employeeSalary(int works) {
        return 100*works;
    }
}
