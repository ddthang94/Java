public class lesson_4 {
    public static void main(String[] args) {
        /* Arithmetic operators in Java */
        int a = 11;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        /* Addition */
        int sum = a + b;
        System.out.println("Sum = " + sum);
        System.out.println("Addition a + b = " + (a+b));
        /* Subtraction */
        int sub = a - b;
        System.out.println("Subtraction a - b = " + sub);
        /* Multiplication */
        int mul = a*b;
        System.out.println("Multiplication a * b = " + mul);
        /* Division */
        double div = (double) a/b;
        System.out.println("Division a / b = " + div);
        /* Modulus */
        int remain = a%b;
        System.out.println("Remain = " + remain);
        int c = 5;
        System.out.println("c = 5");
        ++c;
        System.out.println("Increment ++c >> " + c);
        --c;
        System.out.println("Decrement --c >> " + c);
    }
}
