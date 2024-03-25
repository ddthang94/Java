import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise_collection_1 {
    public static void main(String[] args) {
        /* 1. Create a list which has n elements with n input from keyboard and n is a randomNum from 1-100 */
        System.out.println("Enter the capacity of the list: ");
        int capacity = new Scanner(System.in).nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i=0; i<capacity; i++) {
            int randomNum = rd.nextInt(1,101);
            list.add(randomNum);
        }
        System.out.println("The list = "+list);
    }
}
