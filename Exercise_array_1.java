import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_array_1 {
    public static void main(String[] args) {
        /* 1. Create one dimensional array that has only integer,
        * array has n elements, user input n from keyboard */
        /* 2. Display all value in array */
        /* 3. Reverse array and display new array */
        /* 4. Sort array as value increasing */
        /* 5. Find the sum of all elements in array */
        /* 6. Ask user to enter an integer number, check if array contain that number or not
        * if yes then display the index */
        /*=======================================*/
        System.out.println("Please enter the length of array: ");
        /* read input data */
        int n = new Scanner(System.in).nextInt();
        /* random value for n elements */
        Random rd = new Random();
        /* initialize array with n elements */
        int[] arr = new int[n];
        /* 1. assign random value for each element in array */
        for (int i=0; i<arr.length; i++) {
            int randomNum = rd.nextInt(9);
            arr[i] = randomNum;
        }
        /* 2. display array */
        System.out.println("The array = "+ Arrays.toString(arr));
        /* 3. reversing array and display new array */
        for (int i=0, j=arr.length-1; i<j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("The array after reversing = "+Arrays.toString(arr));
        /* 4. sorting array - increment */
        Arrays.sort(arr);
        System.out.println("After sorting the array = "+Arrays.toString(arr));
        /* 5. Find the sum of all elements in array */
        int Sum = 0;
        for (int element : arr) {
            Sum+=element;
        }
//        for (int i=0; i<arr.length; i++) {
//            Sum+=arr[i];
//        }
        System.out.println("The sum of all elements in array = "+Sum);
        /* 6. Check if the input number is belong to the array */
        System.out.println("Please enter an integer for checking: ");
        int input = new Scanner(System.in).nextInt();
        /* check */
        boolean checker = false;
        String index = "";
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==input) {
                checker = true;
                index += (i+" ");
            }
        }
        /* display result */
        if (checker) {
            System.out.println("The array contain the input number");
            System.out.println("The index = "+index);
        } else {
            System.out.println("The array does not contain the input number");
        }
    }
}