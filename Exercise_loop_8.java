import java.util.Scanner;

public class Exercise_loop_8 {
    public static void main(String[] args) {
        /* Enter integer a > 0 and check if 'a' is a prime number */
        /* Ask user to continue using application or nor, if not then quit */

        /* Ask user if they still want to use the application */
        while (true) {
            /* Ask user to enter only integer */
            System.out.print("Enter an integer: ");
            int a = new Scanner(System.in).nextInt();
            while (a<=0) {
                System.out.print("Enter the integer only, a>0: ");
                a = new Scanner(System.in).nextInt();
            };
            /* Check if the number is a prime number */
            int divisor = 0;
            for (int i=1;i<=a;i++){
                if (a%i==0)
                    divisor++;
            }
            if (divisor==2)
                System.out.println(a+" is a prime number!");
            else
                System.out.println(a+" is not a prime number!");

            System.out.print("Do you want to continue? (Y/N): ");
            String res = new Scanner(System.in).nextLine();
            if (res.equals("y") || res.equals("Y"))
                break;
        }
    }
}
