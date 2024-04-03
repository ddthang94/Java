package eNum;

public class Students {
    /* Attributes */
    private int id;
    private String name;
    private double grade;
    private Comparison comparison;
    /* Constructor */

    public Students(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.comparison = getComparison();
    }

    /* Methods */
    public Comparison getComparison() {
        if (this.grade>=8) {
            comparison=Comparison.excellent;
        } else if (this.grade>=6.5) {
            comparison=Comparison.good;
        } else if (this.grade>=5.0) {
            comparison=Comparison.passed;
        } else {
            comparison=Comparison.failed;
        }
        return comparison;
    }

    /* toString method */

    @Override
    public String toString() {
        return "Id: " + id +
                ", name: '" + name + '\'' +
                ", grade: " + grade +
                ", comparison: " + comparison.des();
    }
}