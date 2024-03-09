public class lesson_5 {
    public static void main(String[] args) {
        /* assignment and comparison operators */

        /* Assignment */
        /* x = 1 */
        int x = 5;
        System.out.println(x);
        /* x += 1 >> x = x + 1 */
        x += 5;
        System.out.println("x1 += 5 >> x1 = x + 5 = " + x);
        /* x -= 1 >> x = x - 1 */
        x -= 2;
        System.out.println("x2 -= 2 >> x2 = x1 - 2 = " + x);
        /* x *= y >> x = x*y */
        x *= 2;
        System.out.println("x3 *= 2 >> x3 = x2 * 2 = " + x);
        /* x /= y >> x = x/y */
        /* x %= y >> x = x%y */

        /* Comparison */
        int a = 1;
        int b = 1;
        System.out.println("a == b : " + (a==b));
        System.out.println("a != b : " + (a!=b));
        System.out.println("a > b : " + (a>b));
        System.out.println("a < b : " + (a<b));
        System.out.println("a >= b : " + (a>=b));
        System.out.println("a <= b : " + (a<=b));

        System.out.println("===============================");

        /* Exercises*/
        System.out.println("\"c = d = e = f = g = 6; h = 2\"");/*  */
        /* c+=3 */
        /* d-=5 */
        /* e*=2 */
        /* f%=5 */
        /* briefly g = g - (h+7) */
        int c = 6;
        c+=3;
        System.out.println("c+=3 >> " + c);
        int d = 6;
        d-=5;
        System.out.println("d-=5 >> " + d);
        int e = 6;
        e*=2;
        System.out.println("e*=2 >> " + e);
        int f = 6;
        f%=5;
        System.out.println("f%=5 >> " + f);
        int g = 6;
        int h = 2;
        g-=(h+7);
        System.out.println("g = g - (h+7) >> g -= (h+7) >> " + g);
    }
}
