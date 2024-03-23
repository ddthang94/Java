import java.util.Scanner;

public class Exercise_string_9 {
    public static String optimizeString (String input) {
        /* remove needless white space at the beginning and the end of String */
        input = input.trim();
        /* split string into array and replace needless white space by a single white space  */
        String[] words = input.split("\\s+");
        /* loop into the string for every element */
        for (int i=0;i<words.length;i++) {
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        /* Enter a string > optimize the string following
        * 1. has no more than 1 white space between 2 characters.
        * 2. 2 character is split by a white space
        * 3. the first character of a string should be uppercase */
        System.out.println("Enter a string: ");
        String input = new Scanner(System.in).nextLine();
        System.out.println(optimizeString(input));
    }
}
