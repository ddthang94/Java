package Abstraction;

public class SuperEmployee extends Employee {
    protected int night;

    /* Constructor */
    public SuperEmployee(String name, String nationality, int id) {
        super(name, nationality, id);
    }
    public SuperEmployee(String name, String nationality, int id, int night) {
        super(name, nationality, id);
        this.night = night;
    }

    @Override
    public double newSalary() {
        return salary+100;
    }
}
