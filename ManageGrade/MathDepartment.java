package ManageGrade;

public class MathDepartment extends Year2023 {
    public MathDepartment(String name, int id) {
        super(name, id);
    }

    /* Override method */

    @Override
    public void calAverage() {
        System.out.println("This is the Math department method");
    }
}
