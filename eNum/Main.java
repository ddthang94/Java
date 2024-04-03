package eNum;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* eNum is a special class that represents a group of constant variables */
//        System.out.println(Comparison.excellent.ordinal());
//        System.out.println(Comparison.good.ordinal());
//        System.out.println(Comparison.passed.ordinal());
//        System.out.println(Comparison.failed.ordinal());

        /* Create a list for testing */
        ArrayList<Students> list = new ArrayList<>();
        /* Initialize objects */
        Students st1 = new Students(1,"John",9.5);
        Students st2 = new Students(2,"Vodka",4.5);
        Students st3 = new Students(3,"Rak",7.5);
        Students st4 = new Students(4,"Bulma",1.0);
        /* Add to the list */
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        /* Display list */
        for (Students st : list) {
            System.out.println(st);
        }
    }
}