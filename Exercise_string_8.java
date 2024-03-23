import java.util.Scanner;

public class Exercise_string_8 {
    public static void main(String[] args) {
        /* Write a program to check a String which was entered from keyboard if that is a string Panlindrome
        * Panlindrome is a String that reads the same forwards and backwards */

        /* Enter string */
        System.out.println("Please enter a string: ");
        String input = new Scanner(System.in).nextLine();
        /* Reverse the input String */
        String reversedString = new StringBuilder(input).reverse().toString();
        /* Check if this is a string palindrome */
        if (input.equalsIgnoreCase(reversedString))
            System.out.println("This is a string panlindrome");
        else
            System.out.println("This is not a string panlindrome");
    }
}