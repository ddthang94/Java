public class Exercise_loop_7 {
    public static void main(String[] args) {
        /* Perfect number is a positive integer that is equal to the sum of its positive divisors */
        /* Find all perfect number in range 1 to 1000 */
        for (int n=1; n<=1000;n++){
            int sum = 0;
            for (int i=1;i<n;i++) {
                if (n % i == 0)
                    sum += i;
            }
            if (sum == n)
                System.out.println(n + " is a perfect number!");
        }
    }
}