public class lesson_13 {
    public static void main(String[] args) {
        /* do while */
        int a = 1;
        int sum = 0;
        do {
            sum+=a;
            a++;
        } while (a<=5);
        System.out.println("Sum = "+sum);
    }
}