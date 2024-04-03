package Inheritance;

public class Test {
    public static void main(String[] args) {
        /* Math department */
        MathDepartment math1 = new MathDepartment("John",12345);
        math1.calAverage();

        /* English department */
        EnglishDepartment english1 = new EnglishDepartment("Mathew", 12312);
        english1.calAverage();

        /* History department */
        HistoryDepartment his1 = new HistoryDepartment("Anna",141251);
        his1.calAverage();
    }
}
