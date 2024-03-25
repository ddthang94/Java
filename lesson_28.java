import java.util.*;

public class lesson_28 {
    public static void main(String[] args) {
        /* Collection in Java */
        /* Array cannot add or delete element so we need collection */
        /* ArrayList: likes an array but ArrayList may resize element;
        and HashMap: allow to store (key, value) and find value following key */

        /* initialize an ArrayList */
        ArrayList<Integer> list = new ArrayList<>();
        /* initialize an ArrayList with a length */
        ArrayList<Integer> list1 = new ArrayList<>(5);
        /* initialize an ArrayList with initial element */
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1,2,3,4,5));

        /* display */
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("======================");

        /* Methods */
        /* add(index, element) - add an element */
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println("List3 ="+list3);
        list3.add(7);
        list3.add(9);
        list3.add(11);
        System.out.println("New list3 = "+list3);
        list3.add(2,10);
        System.out.println("New list3 = "+list3);
        /* size() - return the number of element in list */
        System.out.println("Size of list3 = "+list3.size());
        /* get(int index) - return the value of list at index */
        System.out.println("Get value at index 2 = "+list3.get(2));
        /* remove(int index) - remove the value at index */
        list3.remove(1);
        System.out.println("Remove at index 1 = "+list3);
        /* remove(Integer.valueOf(9) - remove number 9 in the list (datatype can be changed) */
        list3.remove(Integer.valueOf(10));
        System.out.println("Remove value 10, list3 = "+list3);
        /* set(index, element) - set element to replace the element at index */
        list3.set(1,8);
        System.out.println("Set value at index 1 = 8, list3 = "+list3);
        /* contains() - check Collection if it contains an element */
        ArrayList<Integer> list4 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));
        boolean checker = list4.contains(6);
        System.out.println("Check if 6 is contained the list: "+checker);
//        System.out.println("Enter the capacity of the new list: ");
//        int capacity = new Scanner(System.in).nextInt();
//        ArrayList<Integer> newList = new ArrayList<>(Collections.nCopies(capacity,0));
//        Random rd = new Random();
//        for (int i=0; i<newList.size(); i++) {
//            int randomNum = rd.nextInt(1,99);
//            newList.set(i,randomNum);
//        }
//        System.out.println(newList);
//        System.out.println("Enter the number that want to check: ");
//        int input = new Scanner(System.in).nextInt();
//        boolean checkerNum = newList.contains(input);
//        if (checkerNum) {
//            System.out.println("The number "+input+" is in the list");
//        } else {
//            System.out.println("The number "+input+" isn't in the list");
//        }
        /* Collections.sort() - sorting increment */
        ArrayList<Integer> list5 = new ArrayList<>(List.of(13,14,51,12,56,99));
        System.out.println("List5 = "+list5);
        Collections.sort(list5);
        System.out.println("New list5 after sorting = "+list5);
        /* indexOf() - return the first index of element in list
        * if the number is not available then return -1 */
        ArrayList<Integer> list6 = new ArrayList<>(List.of(13,14,51,12,56,51,23,99));
        System.out.println("List6 = "+list6);
        System.out.println("The index of the first 51 appear in the list = "+list6.indexOf(51));
        /* Collections.reverse - reverse the list */
        Collections.reverse(list6);
        System.out.println("List6 after reversing = "+list6);
        /* clear() - remove all elements in the list */
        list6.clear();
        System.out.println("List6 after clearing all elements = "+list6);
        /* List.isEmpty - check if the list is empty */
        boolean checkEmpty = list6.isEmpty();
        System.out.println("Check if the list6 is empty: " + checkEmpty);
    }
}