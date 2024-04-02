public class Student {
    /* Attributes */
    /* Rules: following name convention,
    set private if we don't want to inherit
    set protected if we do want to inherit
    should not set public */
    /* here: global variable (instance variable) */
    private String fullName;
    private double grade;

    /* get&set */
    public String getFullName() {
        return fullName;
    }
    public double getGrade() {
        return grade;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

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
    /* has NO return */
    public void displayInformation() {
        System.out.println(fullName+" : "+grade);
    }
    /* has return */
    public double calAverage(double math, double english) {
        return (math+english)/2;
    }
    /* special method toString */

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", grade=" + grade +
                '}';
    }

    /* Support method and Service method
    * (public) In a class, we can have more than one method, the method can be used in public
    * that is called Service method.
    * (private) The methods are used in side class only that is called Support method */
    /* Support */
    private boolean checkGrade() {
        return this.grade>=8;
    }
    /* Service */
    public void checkIfValid() {
        if (checkGrade()) {
            System.out.println("You are passed");
        } else {
            System.out.println("You are not passed");
        }
    }

    /* Overloading method: the method has the same name but has different signature (parameter) */
    /* Signature: the number of signature, datatype, index of signature */
    public double calAverage(double math, double english, double history) {
        return (math+english+history)/3;
    }

    /* Parameter list method */
    public double sumOfGrade(double ... arr) {
        double sum = 0.0;
        for (double x : arr){
            sum+=x;
        }
        return sum;
    }
}