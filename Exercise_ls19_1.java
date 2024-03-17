import java.util.Scanner;

public class Exercise_ls19_1 {
    /* Solving Quadratic equation ax^2 + bx + c = 0 */
    /* Find solution of quadratic equation when a=1, b=2, c=3 */
    /* Find solution of quadratic equation when a=1, b=2, c=1 */
    /* Find solution of quadratic equation when a=1, b=2, c=-3 */
    public static String solveQuadraticEquation(double a, double b, double c) {
        /* check if the equation is a simple equation */
        if (a==0) {
            if (b==0 && c==0) {
                return "The equation has many solutions!";
            }
            else if (b==0 && c!=0) {
                return "The equation has no solution!";
            } else
                return "The equation has solution: " + (-c/b);
        } else {
            /* the equation is a quadratic equation */
            double delta = Math.pow(b,2) - (4*a*c);
            if (delta<0) {
                return "The equation has no solution!";
            } else if (delta==0) {
                double x = -b/(2*a);
                return "The equation has double equation x = " + x;
            } else {
                double x1 = (-b+Math.sqrt(delta)) / (2*a);
                double x2 = (-b-Math.sqrt(delta)) / (2*a);
                return "The equation has 2 solutions x1 = " + x1 + " and x2 = "+x2;
            }
        }
    }


    public static void main(String[] args) {
        String res = solveQuadraticEquation(1,2,3);
        System.out.println(res);
        String res2 = solveQuadraticEquation(1,2,1);
        System.out.println(res2);
        String res3 = solveQuadraticEquation(1,2,-3);
        System.out.println(res3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        String result = solveQuadraticEquation(a,b,c);
        System.out.println("The result is: " + result);
    }
}
