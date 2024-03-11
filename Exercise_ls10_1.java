import java.util.Scanner;

public class Exercise_ls10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the average grade: ");
        float p = sc.nextFloat();
        /* p>=8 Excellent; p<8 && p>=6.5 Good; p<6.5&&p>=5 Average; p<5 Failed*/
        String res = (p>=8) ? "Excellent" : ((p<8 && p>=6.5) ? "Good" : ((p<6.5 && p>=5) ? "Average" : "Failed"));
        System.out.println("You are "+res);
    }
}
