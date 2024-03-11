import java.util.Scanner;

public class lesson_11 {
    public static void main(String[] args){
        /* Switch case: basic */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int a = sc.nextInt();
        int div = a%2;
        switch (div) {
            case 0:
                System.out.println("The number "+a+" is an even number");
                break;
            case 1:
                System.out.println("The number "+a+" is an odd number");
                break;
            default:
                System.out.println("Enter only integer number!");
                break;
        }
    }
}