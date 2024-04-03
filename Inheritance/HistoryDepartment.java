package Inheritance;

public class HistoryDepartment extends Year2023 {
    public HistoryDepartment(String name, int id) {
        super(name, id);
    }

    @Override
    public void calAverage() {
        System.out.println("This is History department method");
    }
}
