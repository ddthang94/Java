import java.util.Scanner;

public class Exercise_ls9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your high in meters: ");
        double h = sc.nextDouble();
        System.out.println("Enter your weight in kilograms: ");
        int w = sc.nextInt();
        double BMI = (double) w/Math.pow(h,2);
        System.out.println("Your BMI is " + BMI);
        /* If Else condition */
        if (BMI < 15) {
            System.out.println("You are too thin!");
        } else if (BMI>=15 && BMI<16) {
            System.out.println("You are thin!");
        } else if (BMI>=18.5 && BMI<25) {
            System.out.println("No worries, you are normal!");
        } else if (BMI>=25 && BMI <30) {
            System.out.println("You are little overweight!");
        } else if (BMI>=30 && BMI<35) {
            System.out.println("You are fat!");
        } else {
            System.out.println("You are overweight!");
        }
    }
}
