import java.util.Scanner;

public class Exercise_loop_1 {
    public static void main(String[] args) {
    /* enter integer n and display n! using for and while loop */
        System.out.println("Enter an integer number: ");
        int n = new Scanner(System.in).nextInt();
        int res = 1;
        for (int i=1;i<=n;i++){
            res*=i;
        }
        System.out.println("The factorial of n is " + res);
    }
}
