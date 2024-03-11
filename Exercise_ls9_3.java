import java.util.Scanner;

public class Exercise_ls9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a month for checking: ");
        int m = sc.nextInt();
        System.out.println("The month is " + m);

        if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
            System.out.println("This month has 31 days.");
        } else if (m==2) {
            System.out.println("Please enter the year:");
            int y = new Scanner(System.in).nextInt();
            if ((y%4 == 0) && (y%100!=0)) {
                System.out.println("The year is "+y+" which is a leap year");
                System.out.println("This February has 29 days.");
            } else {
                System.out.println("The year is "+y+" which is a non-leap year");
                System.out.println("This February has 28 days.");
            }
        } else {
            System.out.println("This month has 30 days.");
        }
    }
}
