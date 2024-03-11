import java.util.Scanner;

public class Exercise_ls9_5 {
    public static void main(String[] args) {
        System.out.println("Enter the month and check which quarter it is: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("The month is "+m);
        if (m==1 || m==2 || m==3) {
            System.out.println("This month is belong the 1st (first) quarter of the year!");
        } else if (m==4 || m==5 || m==6) {
            System.out.println("This month is belong the 2nd (second) quarter of the year!");
        } else if (m==7 || m==8 || m==9) {
            System.out.println("This month is belong the 3rd (third) quarter of the year!");
        } else if (m==10 || m==11 || m==12) {
            System.out.println("This month is belong the 4th (fourth) quarter of the year!");
        }
    }
}
