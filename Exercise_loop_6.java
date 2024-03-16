public class Exercise_loop_6 {
    public static void main(String[] args) {
        /* Find sum of 1!+2!+3!+...+10! */
        int m = 1;
        int sum = 0;
        for (int i=1;i<=10;i++) {
            m*=i;
            sum+=m;
        }
        System.out.println("Sum =" + sum);
    }
}
