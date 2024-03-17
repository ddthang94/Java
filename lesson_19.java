public class lesson_19 {
    /* function with return */
    public static int sumOfThreeNumbers (int x, int y, int z) {
        return x+y+z;
    }

    /* function without return */
    public static void helloWorld (String gender) {
        if (gender.equals("Female"))
            System.out.println("Hello, I am a female");
        else if (gender.equals("Male"))
            System.out.println("Hello, I am a male");
        else
            System.out.println("Something not available");
    }

    public static void main(String[] args) {
//        int sum = sumOfThreeNumbers(1,2,3);
//        int sum2= sumOfThreeNumbers(4,5,6);
//        System.out.println(sum);
//        System.out.println(sum2);
        helloWorld("Male");
        helloWorld("female");
        helloWorld("Female");
    }
}
