import java.util.Arrays;
import java.util.Scanner;

public class lesson_27 {
    public static void main(String[] args) {
        /* One dimensional array */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int n = sc.nextInt();

        /* initialize and assign length for array */
        int[] arr = new int[n];
        System.out.println("The length of array: "+arr.length);
        /* assign value for each element in array */
        for (int i=0; i<arr.length;i++) {
            System.out.print("Arr["+i+"]= ");
            arr[i] = sc.nextInt();
        }
        /* display array */
        System.out.println("The array is: "+ Arrays.toString(arr));
        /* sort array */
        Arrays.sort(arr);
        System.out.println("Sorting array: "+Arrays.toString(arr));
        /* reverse array */
        for (int i=0, j=arr.length-1; i<j ; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("The array after reversing: "+Arrays.toString(arr));
        System.out.println("=======================");

        /* assign array to a new array - same memory area */
        int[] arr1 = {1,3,5,7,9};
        System.out.println("Array 1: "+ Arrays.toString(arr1));
        int[] arr2 = arr1;
        arr1[1] = 0;
        System.out.println("New array 1: "+ Arrays.toString(arr1));
        System.out.println("Array 1 = Array 2, But after changing, array 2: "+ Arrays.toString(arr2));
        System.out.println("=======================");

        /* clone an array - if change parents array, the child array will not be changed */
        int[] arr3 = {1,2,3,4,5,6};
        int[] arr4 = arr3.clone();
        System.out.println("arr3= "+Arrays.toString(arr3));
        System.out.println("arr4= "+Arrays.toString(arr4));
        arr3[0] = 0;
        System.out.println("Change value at index 0 to 0 then arr3= "+Arrays.toString(arr3));
        System.out.println("arr4= "+Arrays.toString(arr4));
        System.out.println("=======================");
    }
}