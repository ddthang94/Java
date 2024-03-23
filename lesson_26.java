public class lesson_26 {
    public static void main(String[] args) {
        /* Array is a container object that holds many or single data type */

        /* initialize */
        String[] arrString;
        int[] arrInteger;
        boolean[] arrBoolean;

        /* assign length for an array */
        String[] arrString1 = new String[15];  // length
        int[] arrInteger1 = new int[8];

        /* assign initial value for element inside array */
        String[] arrString2 = new String[]{"I","Love","Coding"};
        int[] arrInteger2 = new int[]{1,2,3,4,5,6,7,8};
        String[] arrString3 = {"I", "Love","Coding"};

        /* get element in array */
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[5]);
        System.out.println(arr[9]);
        System.out.println("Length = "+arr.length);

        /* review each element in an array */
        /* Method 1: */
        System.out.println("The array has: ");
        for (int element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println();
        /* Method 2: */
        for (int i=0;i<arr.length;i++) {
            /* display index */
            System.out.print("index "+i+", ");
            /* display value from index i */
            System.out.print(arr[i]+"||");
        }
        System.out.println();
        /* change value of an element at index i */
        /* Method 1: */
        System.out.println("7th element is "+arr[7]);
        arr[7]=88;
        System.out.println("Changed 7th element: "+arr[7]);
        /* Method 2: Use for loop to update all element */
        System.out.println("New array after adding 1 to every element: ");
        for (int i=0; i<arr.length; i++) {
            arr[i]+=1;
            System.out.print(arr[i]+ " ");
        }
    }
}