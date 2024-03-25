import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_collection_2 {
    public static void main(String[] args) {
        /* Create a list
        * 1. a new list has the element is equal to element in the old list but power of 2
        * 2. count how many element is bigger than 50 inside the new list */

        System.out.println("Enter the capacity of the list: ");
        int capacity = new Scanner(System.in).nextInt();
        /* create the list */
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<capacity; i++) {
            System.out.print("Element["+i+"]= ");
            int element = new Scanner(System.in).nextInt();
            list.add(i,element);
        }
        System.out.println("The list = "+list);

        /*  1. Create a new list */
        ArrayList<Integer> powerList = new ArrayList<>();
        /* loop through the list and power it up, after that add to the new list */
        for (int element : list ) {
            powerList.add(element*element);
        }
        System.out.println("The powerList = "+powerList);

        /* 2. count how many number is bigger than 50 in the */
        int count = 0;
        boolean checker = false;
        for (int element : powerList) {
            if (element>50) {
                count++;
                checker=true;
            }
        }
        if (checker) {
            System.out.println("We have "+count+" number that is bigger than 50 in the list.");
        } else {
            System.out.println("We don't have any number that is bigger than 50 in the list.");
        }
    }
}
