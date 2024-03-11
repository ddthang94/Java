import java.util.Scanner;

public class Exercise_ls11_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which represent a month to print the days of that month: ");
        int m = sc.nextInt();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(m + " has 31 days...");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(m + " has 30 days...");
                break;
            case 2:
                System.out.println("Check if the year is a leap year, please enter the year");
                int y = new Scanner(System.in).nextInt();
                String res = ((y%4==0) && (y%100!=0)) ? "This is February has 29 days" : "This is February has 28 days";
                System.out.println(res);
                break;
            default:
                System.out.println("The month is not available. Exit...");
                break;
        }
    }
}