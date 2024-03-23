import java.util.Scanner;

public class Exercise_string_4 {
    public static void main(String[] args) {
        /* Convert message to encode message */
        /* encode table */
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        /* Enter message that need to be encoded */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String input = sc.nextLine();

        /* variable to store your message after encoding */
        String output = "";

        for (int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            /* find the index of character inside String a */
            int index = a.indexOf(ch);
            /* if character isn't belong String a then display */
            if (index==-1) {
                output+=ch;
            } else {
                /* if character is belong String a then encode */
                output+=b.charAt(index);
            }
        }
        /* display message after encoding */
        System.out.println("Message after encoding:" + output);
    }
}
