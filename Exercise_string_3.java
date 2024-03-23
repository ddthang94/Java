import java.util.Scanner;

public class Exercise_string_3 {
    /* Check if the password is valid: aaaaaAAAAAA1 */
    /* - minimum 6 characters
     *  - including minimum 1 alphabet (lowercase or uppercase)
     *  - including minimum 1 digit */
    /* Ask user to enter a password and compare, if the password is correct then open
     *  if wrong over 5 times then quit */
    /* check password function */
    public static boolean passwordChecker(String password) {
        /* length checked */
        if (password.length()<6) {
            return false;
        }
        /* check alphabet available */
        boolean hasLetter = false;
        /* toCharArray: String was converted to array */
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }
        if (!hasLetter) {
            return false;
        }
        /* check digit available */
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit=true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String password = "";
        while (true) {
            System.out.println("Create your password: ");
            System.out.println("At least 6 characters, 1 alphabet and 1 digit!");
            String newPassword = new Scanner(System.in).nextLine();
            if (passwordChecker(newPassword)) {
                password=newPassword;
                System.out.println("The new password has been created!");
                System.out.println("Quit");
                System.out.println("==================================");
                break;
            }
            else {
                System.out.println("The password is invalid. At least 6 characters, 1 alphabet and 1 digit!");
            }
        }
        /* Ask user to enter password, if incorrect over 5 times then quit */
        int count = 0;
        String login = "";
        while (true) {
            System.out.println("Login");
            System.out.println("Please enter your password: ");
            login = new Scanner(System.in).nextLine();
            /* check if the password is correct */
            if (login.equals(password)) {
                System.out.println("Login successfully!");
                break;
            } else {
                System.out.println("The password is incorrect, please re-enter your password!");
                System.out.println("Can enter only "+(5-count)+" times");
                System.out.println("====================================");
                count++;
            }
            /* count>5 then quit */
            if (count>5) {
                System.out.println("You have entered the wrong password over 5 times, Login has been locked!");
                break;
            }
        }
    }
}
