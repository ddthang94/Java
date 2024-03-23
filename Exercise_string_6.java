import java.util.Scanner;

public class Exercise_string_6 {
    public static void main(String[] args) {
        /* Splitting digit and character from String which is entered by users.
        Set into 2 separate String */
        /* Ex: enter: abc123 then display: abc and 123 */

        System.out.println("Enter a string: (including character and number)");
        String input = new Scanner(System.in).nextLine();

        /* Split string */
        StringBuilder str = new StringBuilder();
        StringBuilder num = new StringBuilder();
        /* loop through the String */
        for (int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else if (Character.isLetter(ch)) {
                str.append(ch);
            }
        }
        System.out.println(str);
        System.out.println(num);
    }
}
