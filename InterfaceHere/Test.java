package InterfaceHere;

public class Test {
    public static void main(String[] args) {
        /* Interface is used when we want the Child Class inherit from more than 1 Parent Class (Base Class) */
        /* Interface is initialized as a Class with Attributes is constant 'static' + 'final' and Abstract method
        * Interface has Abstract method, so we should use Override method from where 'implements' them
        * A class can be 'implements' from more than 1 interface.
        * Interface can use 'extends' to extend from 1 or others interface */
        InheritedInterface kt1 = new InheritedInterface();
        double sal = kt1.salary(100,21);
        System.out.println("The salary is "+sal);
    }
}