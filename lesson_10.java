import java.util.Scanner;

public class lesson_10 {
    public static void main(String[] args) {
        /* Binary operator & n-ary operator */

        /* Ternary operator - Toan tu 3 ngoi */
        System.out.println("Enter an integer number: ");
        int n = new Scanner(System.in).nextInt();
        String result = (n%2==0) ? "even" : "odd";
        System.out.println("The number is " + result);
    }
}
