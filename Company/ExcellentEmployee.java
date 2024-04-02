package Company;

public class ExcellentEmployee extends Employee {
    public ExcellentEmployee(String name, String nationality, int id) {
        super(name, nationality, id);
    }

    @Override
    public double newSalary() {
        return salary+200;
    }
}
