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
    Student std2 = new Student("Thang",10.0);
    std1.displayInformation();
    std2.displayInformation();

    /* Constructor
    * is a special method that is used to initialize objects.
    * type: default (has no parameter) - has parameter.
    * rules: name of a constructor should be the same to the name of class */
    }
}