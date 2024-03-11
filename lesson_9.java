import java.util.Scanner;

public class lesson_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the average grade: ");
        double avg = sc.nextDouble();
        // If Else condition
        if (avg >= 7.0 ) {
            System.out.println("Excellent. You passed, congratulation!!");
        } else if (avg<7 && avg>=5) {
            System.out.println("Good. You passed. Do you want to upgrade your mark?");
        } else {
            System.out.println("Sorry, you need to take the exam again :( ");
        }
    }
}