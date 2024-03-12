import java.util.Scanner;

public class lesson_12 {
    public static void main(String[] args) {
        /* While loop - Syntax: while (condition) {code} */
//        int x = 0;
//        while (x<=5) {
//            System.out.println("x= "+x);
//            x++;
//        }
        /* Exercise */
        System.out.println("Enter a number from 1 to 99: ");
        int n = new Scanner(System.in).nextInt();
        while (n<1 || n>99) {
            System.out.println("Please enter only number from 1 to 99!");
            n = new Scanner(System.in).nextInt();
        }
        System.out.println("You entered the number: "+n);
    }
}
