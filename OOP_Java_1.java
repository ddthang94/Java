public class OOP_Java_1 {
    public static void main(String[] args) {
    /* OOP - object-Oriented Programming : is about creating objects that contain
    both data (attributes) and methods */
    /* Class (Noun) is a template for objects and object is an instance of a class.
    * When the individual objects are created,
    * they inherit all the variables and methods from the class */
    /* Object has attribute (thuoc tinh), methods (phuong thuc) */
    /* Package is all classes which has the same attribute */

    /* Access modifiers */
    /* Type      || Class    || Package  ||  SubClass    || Outside */
    /* public    ||  yes     ||  yes     ||    yes       ||  yes    */
    /* protected ||  yes     ||  yes     ||    yes       ||    -    */
    /* ...       ||  yes     ||  yes     ||      -       ||    -    */
    /* private   ||  yes     ||     -    ||      -       ||    -    */

        /* initialize object is belong to class "Student" */
        Student std1 = new Student();
        std1.displayInformation();

        /* Constructor
        * is a special method that is used to initialize objects.
        * type: default (has no parameter) - has parameter.
        * rules: name of a constructor should be the same to the name of class */
        Student std2 = new Student("Thang",10.0);
        std2.displayInformation();

        /* Get */
        Student std3 = new Student();
        std3.displayInformation();
        System.out.println(std3.getFullName());
        System.out.println(std3.getGrade());

        /* Set */
        std3.setFullName("ThangD");
        std3.setGrade(9.5);
        std3.displayInformation();

        /* Methods
        * type: has return and has NO return */
        double gradeAvg = std3.calAverage(8.0,9.0);
        System.out.println(gradeAvg);

        /* test toString method */
        System.out.println(std3);

        /* test service method */
        std3.checkIfValid();
    }
}