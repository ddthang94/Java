public class lesson_16 {
    public static void main(String[] args){
        /* Break and Continue */
        /* Calculate the sum from 1 to 5 but skip 3 */
        int sum = 0;
        for (int i=0; i<=5; i++) {
            if (i==3)       /* skip 3 */
                continue;
            else
                sum+=i;
        }
        System.out.println("Sum = "+sum);
    }
}
