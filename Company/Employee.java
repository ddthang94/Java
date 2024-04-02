package Company;

public abstract class Employee {
    protected String name;
    protected String nationality;
    protected int id;
    protected double salary = 900;

    /* Constructor */

    public Employee(String name, String nationality, int id) {
        this.name = name;
        this.nationality = nationality;
        this.id = id;
    }

    /* Abstract method */
    public abstract double newSalary();
}
