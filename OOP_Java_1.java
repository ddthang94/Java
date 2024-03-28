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
    /* Type     || Class    || Package  ||  SubClass    || Outside */
    /* public   ||  yes     ||  yes     ||    yes       ||  yes    */
    /* protected||  yes     ||  yes     ||    yes       ||    -    */
    /* ...      ||  yes     ||  yes     ||      -       ||    -    */
    /* private  ||  yes     ||     -    ||      -       ||    -    */

    /* initialize object is belong to class "Student" */
    Student std1 = new Student();
    Student std2 = new Student();
    std1.displayInformation();
    std2.displayInformation();
    }
}