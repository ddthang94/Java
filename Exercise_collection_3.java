import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_collection_3 {
    public static void main(String[] args) {
        /* Write a program to answer the result of these calculations
        * quest = {"2+5+7=","5*18=","sqrt(16)=","12%2="} */
        Scanner sc = new Scanner(System.in);
        /* Create the list question */
        ArrayList<String> quest = new ArrayList<>(List.of("2 + 5 + 7 = ","5 * 10 = ", "sqrt(16) = ", "12 % 2 = "));
        /* Create the list of answer */
        ArrayList<Float> answer = new ArrayList<>(List.of(14f,50f,4f,0f));
        for (int i=0; i<quest.size(); i++) {
            System.out.print(quest.get(i));
            /* enter result */
            Float result = new Scanner(System.in).nextFloat();
            /* check the result */
            if (result.equals(answer.get(i))) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The result is "+answer.get(i));
            }
        }
    }
}
