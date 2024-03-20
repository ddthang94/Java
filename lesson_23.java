import java.util.Scanner;

public class lesson_23 {
    public static void main(String[] args) {
        /* Char */
        /* initialize */
        char ch = 'a';
        char ch2 = 66;
        System.out.println(ch);
        System.out.println(ch2);
        /* get char from input */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a character: ");
//        String s = sc.nextLine();
//        char ch4 = s.charAt(0);
//        System.out.println("The input: "+ch4);

        System.out.println();
        /* compare 2 characters */
        /* compareTo() uses to compare 2 characters and return an integer number */
        /* if 2 characters look the same then return 0 */
        /* 1st char < 2nd char then return negative number */
        /* 1st char > 2nd char then return positive number */
        System.out.println(Character.compare('b','b'));
        System.out.println(Character.compare('a','b'));
        System.out.println(Character.compare('b','a'));
        System.out.println();

        /* char method */
        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';

        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch8));
        System.out.println(Character.isWhitespace(ch7));
    }
}
