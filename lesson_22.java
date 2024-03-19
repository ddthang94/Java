import java.util.Random;

public class lesson_22 {
    public static void main(String[] args) {
        /* random in Java */

        /* initialize a random object */
        Random rd = new Random();
        /* get a random integer number */
        int num = rd.nextInt(-100,100); // random (-100, 100)
        System.out.println(num);
    }
}
