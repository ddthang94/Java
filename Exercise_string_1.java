import java.util.Scanner;

public class Exercise_string_1 {
    public static void main(String[] args) {
        /* Enter a String and calculate character following lowerCase, upperCase, number and whiteSpace */

        /* Ask user to enter a string */
        System.out.println("Please enter a string: ");
        /* Read input from keyboard */
        String str = new Scanner(System.in).nextLine();
        /* Initialize the variable that need to be counted */
        int lowerCase =0;
        int upperCase =0;
        int digit=0;
        int whiteSpace =0;
        /* Loop into the string */
        for (int i=0;i<str.length();i++) {
            /* Add String to an array and return the character at index i */
            char ar = str.charAt(i);
            /* Create the condition and start counting */
            if (Character.isLowerCase(ar)) {
                lowerCase++;
            } else if (Character.isUpperCase(ar)) {
                upperCase++;
            } else if (Character.isDigit(ar)) {
                digit++;
            } else if (Character.isWhitespace(ar)) {
                whiteSpace++;
            }
        }
        /* Print the result */
        System.out.println("The number of lowerCase character: "+lowerCase);
        System.out.println("The number of upperCase character: "+upperCase);
        System.out.println("The number of digit: "+digit);
        System.out.println("The number of white space: "+whiteSpace);
    }
}
