package InterfaceHere;

public class InheritedInterface implements ExampleInterface {
    @Override
    public void information(String name, int id, int birthDay) {

    }

    @Override
    public double salary(double salaryDay, int works) {
        return salaryDay*works;
    }
}
