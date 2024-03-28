public class Student {
    /* Attributes */
    /* Rules: following name convention,
    set private if we don't want to inherit
    set protected if we do want to inherit
    should not set public */
    /* here: global variable */
    private String fullName;
    private double grade;

    /* Constructor - has no parameter */
//  Alt+ins > auto generating
    /* Constructor type: default */
    public Student() {
        fullName = "No name";
        grade = 0.0;
    }
    /* Constructor type: has parameter */
    /* local variable fullName + grade => here */
//  this : keyword refers to the current object in a method or constructor.
    public Student(String fullName, double grade) {
        this.fullName = fullName;
        this.grade = grade;
    }

    /* Methods (functions) */
    public void displayInformation() {
        System.out.println(fullName+" : "+grade);
    }
}