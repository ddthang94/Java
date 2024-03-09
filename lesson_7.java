public class lesson_7 {
    public static void main(String[] args) {
        /* Postfix and Prefix */
        /* a++, a-- : Postfix */
        /* ++a, --a : Prefix */

        int a=1;
        int b=2;
        int c= a++ - ++b +1;
        /* Rules:   1. Calculate Prefix */
        /* ++b >> b = 3 */
        /*          2. The following operators */
        /* c = 1 - 3 + 1 */
        /*          3. Add value for the variable which are in the left-side of equals (=) */
        /* c = -1 */
        /*          4. Calculate Postfix */
        /* a++ >> a = 2 */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
