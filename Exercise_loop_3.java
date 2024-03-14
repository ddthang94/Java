import java.util.Scanner;

public class Exercise_loop_3 {
    public static void main(String[] args) {
        /* Enter an integer a, if the number is an even num from 0-a then calculate the sum */
        /* if a is an odd number then display "We do not calculate the sum of odd number, quit!" */
        System.out.println("Enter an integer: ");
        int a = new Scanner(System.in).nextInt();
        int sum = 0;
        if (a%2==0) {
            for (int i=0;i<=a;i+=2) {
                sum+=i;
            }
            System.out.println("The sum is: " + sum);
        } else {
            System.out.println("We do not calculate the sum of odd numbers, quit!");
        }
    }
}
