import java.util.Scanner;

public class lesson_8 {
    public static void main(String[] args) {
        /* Scanner : input&output */
        // Scanner sc = new Scanner(System.in);

//        System.out.println("Enter information: ");
//        String info = new Scanner(System.in).nextLine();
//        System.out.println("Information is " + info);
//
//        /* Replace variable name in multiple lines: */
//        /* select the variable and use Shift+F6 */
//        System.out.println("Enter only Integer datatype: ");
//        int a = new Scanner(System.in).nextInt();
//        System.out.println("The number is " + a);
//
//        System.out.println("Enter only Float datatype");
//        float b = new Scanner(System.in).nextFloat();
//        System.out.println("The number is " + b);

        /* Exercise */
        System.out.println("Enter the radius of circle: ");
        double r = new Scanner(System.in).nextDouble();
        System.out.println("The radius is: " + r);
        double PI = Math.PI;
        double P = 2*PI*r;
        System.out.println("The perimeter is: " + P);
        double S = PI * Math.pow(r, 2);
        System.out.println("The area is: " + S);
    }
}