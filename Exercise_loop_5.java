public class Exercise_loop_5 {
    public static void main(String[] args) {
        /* find and display all numbers which are divisible by 3 from 10 to 50 */
        for (int i=10; i<=50; i++) {
            if (i%3!=0)
                continue;
            else
                System.out.print(i+" ,");
        }
    }
}
