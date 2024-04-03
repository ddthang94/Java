package ArrangingClasses;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        /* Create an array list */
        ArrayList<Products> pds = new ArrayList<>();
        Products pd1 = new Products(1,"iPhone",999);
        Products pd2 = new Products(2,"Samsung",899);
        Products pd3 = new Products(3,"Motorola",699);
        /* Add to list */
        pds.add(pd1);
        pds.add(pd2);
        pds.add(pd3);
        /* Display the list */
        System.out.println("The list of products before sorting: ");
        for (Products pd : pds) {
            System.out.println(pd);
        }
        /* Sorting */
        Collections.sort(pds);
        System.out.println("The list of products after sorting: ");
        for (Products pd : pds) {
            System.out.println(pd);
        }
    }
}