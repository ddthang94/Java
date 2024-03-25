import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise_collection_4 {
    public static void main(String[] args) {
        /* Enter a list with n random elements, n is integers input from keyboard */
        /* 1. count the number of which are smaller than 80 */
        /* 2. display the index of them */

        System.out.println("Enter the capacity of the list: ");
        int capacity = new Scanner(System.in).nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i=0; i<capacity; i++) {
            int randNum = rd.nextInt(99);
            list.add(randNum);
        }
        System.out.println("The list = "+list);
        /* 1. count the number of which are smaller than 80 */
        int count = 0;
        for (int element : list) {
            if (element<80) {
                count++;
            }
        }
        if (count==0){
            System.out.println("There is no number that is smaller than 80 in the list.");
        } else {
            System.out.println("There are "+count+" numbers that are smaller than 80");
        }
        /* 2. display the index of them */
        System.out.println("The index of those number: ");
        for (int i=0; i<list.size(); i++) {
            if (list.get(i)<80)
                System.out.print(i+" ");
        }
    }
}
