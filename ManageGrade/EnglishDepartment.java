package ManageGrade;

public class EnglishDepartment extends Year2023 {
    public EnglishDepartment(String name, int id) {
        super(name, id);
    }

    @Override
    public void calAverage() {
        System.out.println("This is English department method");
    }
}
