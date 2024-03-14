import java.util.Scanner;

public class Exercise_loop_4 {
    public static void main(String[] args) {
        /* Enter integer number n from keyboard and calculate sum of all odd numbers from 1 to n */
        /* 1. Enter 7 then calculate sum of all number from 1 to 7, but we skip 3 */
        /* 2. Try to break when catching 3 during the loop */
        System.out.println("Enter integer number: ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        if (n%2!=0) {
            for (int i=1;i<=n;i+=2) {
                if (i==3)
//                    continue; /* 1 */
                    break;      /* 2 */
                else
                    sum+=i;
            }
            System.out.println("The sum is: "+sum);
        }
    }
}
