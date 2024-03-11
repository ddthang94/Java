import java.util.Scanner;

public class Exercise_ls9_2 {
    public static void main(String[] args) {
        /* Condition: A leap year is a year which is divisible by 4 and isn't divisible by 100 */
        /* Other is called non-leap year */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year for checking: ");
        int year = sc.nextInt();
        System.out.println("The year is "+ year);

        if ((year%4 == 0) && (year%100!=0)) {
            System.out.println("The year is a leap year!");
        } else {
            System.out.println("The year is a non-leap year!");
        }
    }
}
