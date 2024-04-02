package Company;

public class Test {
    public static void main(String[] args) {
        /* Inheritance */
        /* Base class (parent class) - initialize as normal (use protected);
        the child class(delivered class) is inherited from base class (use 'extends') */
//        Employee em1 = new Employee("Employee 1", "VietNam",123456);
//        double sal = em1.salary();
//        System.out.println("The salary of is "+sal);

        /* superEmployee */
        SuperEmployee spEm1 = new SuperEmployee("Super employee 1","VietNam",3432123, 5);
        double salSup = spEm1.newSalary();
        System.out.println("The super salary is "+salSup);

        /* excellentEmployee */
        ExcellentEmployee exEm1 = new ExcellentEmployee("Excellent employee 1", "VietNam",1412312);
        double salEx = exEm1.newSalary();
        System.out.println("The excellent salary is "+salEx);

        /* Abstract class
        * The class has Abstract method must be Abstract
        * The Abstract method is a method which has name and parameter but no content
        * Abstract class cannot be initialed by using 'new'
        * The child class that is inherited from Abstract class should be redefined Abstract method */

    }
}