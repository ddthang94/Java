import java.util.Scanner;

public class Exercise_ls19_2 {
    public static double sum(double a, double b) {
        return a+b;
    }
    public static double subtraction(double a, double b) {
        return a-b;
    }
    public static double multiplication(double a, double b) {
        return a*b;
    }
    public static double division(double a, double b) {
        if (b==0)
            System.out.println("Cannot divide by 0");
        return a/b;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter number a: ");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("Enter number b: ");
            double b = new Scanner(System.in).nextDouble();
            System.out.println("Enter the operator (+,-,*,/): ");
            String operator = new Scanner(System.in).nextLine();
            double result;
            if (operator.equals("+")) {
                result = sum(a,b);
                System.out.println("The sum has result "+result);
            }
            else if (operator.equals("-")) {
                result = subtraction(a,b);
                System.out.println("The subtraction has result "+result);
            }
            else if (operator.equals("*")) {
                result = multiplication(a,b);
                System.out.println("The multiplication has result "+result);
            }
            else if (operator.equals("/")) {
                result = division(a,b);
                System.out.println("The division has result " +result);
            } else {
                System.out.println("The operator must be +,-,* or /...!");
            }
            System.out.println("Do you want to continue? (Y/N)");
            String decision = new Scanner(System.in).nextLine();
            if (decision.equals("N"))
                break;
        }
    }
}
