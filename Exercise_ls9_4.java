import java.util.Scanner;

public class Exercise_ls9_4 {
    public static void main(String[] args) {
        /* Solve the equation: ax^2 + bx + c = 0 */
        /* Delta = b^2-4ac */
        System.out.print("Enter a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Enter b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Enter c: ");
        int c = new Scanner(System.in).nextInt();
        double D = Math.pow(b,2) - (double)4*a*c;
        System.out.println("Delta is " + D);
        double n1, n2;
        if (D<0) {
            System.out.println("The equation has no solution!");
        } else if (D==0) {
            n1 = n2 = (-b/(2*a));
            System.out.println("The equation has double solution which is n1 = n2 = "+n1);
        } else if (D>0){
            n1 = (-b+Math.sqrt(D))/2*a;
            n2 = (-b-Math.sqrt(D))/2*a;
            System.out.println("The equation has 2 different solutions n1 = "+n1 + " and n2 = "+n2);
        }
    }
}
