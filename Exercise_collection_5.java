import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_collection_5 {
    public static void main(String[] args) {
        /* list = {1, 9, 3, 14, 5, 27, 8} */
        /* 1. Display the 2nd highest number and 2nd lowest number in the list */
        /* 2. Display index */
        ArrayList<Integer> list = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        System.out.println("List = "+list);
        /* copy to the new list */
        ArrayList<Integer> newList = new ArrayList<>(list);
        System.out.println("New list = "+newList);
        /* sorting the new list */
        Collections.sort(newList);
        System.out.println("New list after sorting = "+newList);
        /* the 2nd highest number and 2nd lowest number */
        int highestNum = newList.get(newList.size()-2);
        int lowestNum = newList.get(1);
        System.out.println("The 2nd highest number in the list = "+highestNum);
        System.out.println("Index = "+list.indexOf(highestNum));
        System.out.println("The 2nd lowest number in the list = "+lowestNum);
        System.out.println("Index = "+list.indexOf(lowestNum));
        /* display index */
    }
}
