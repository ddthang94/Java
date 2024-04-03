package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        System.out.println(emp1.employeeSalary(21));

        Employee emp2 = new Boss();
        System.out.println(emp2.employeeSalary(21));
        System.out.println("==========================");

        Employee emp3 = new Manager("Mathew","55555","Vietnam");
        System.out.println(emp3.employeeSalary(21));
        System.out.println("Emp3 is a Manager: "+emp3.getName()+" : "+emp3.getId());

//        emp3 = new Boss();
//        System.out.println(emp3.employeeSalary(21));
//        System.out.println("Emp3 is a Boss: "+emp3.getName()+" : "+emp3.getId());
//        null

        emp3 = new Boss(emp3.getName(), emp3.getId(), emp3.getCountry());
        System.out.println(emp3.employeeSalary(21));
        System.out.println("Emp3 is a Boss: "+emp3.getName()+" : "+emp3.getId());
    }
}