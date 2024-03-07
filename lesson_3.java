public class lesson_3 {
    public static void main(String[] args) {
        /* int > long > float > double */
        int a = 5;
        int b = 10;
        double div = a/b;
        System.out.println(div);
        double div_1 = (double) a/b;
        System.out.println(div_1);

        /* double > float > long > int (data loss possibility) */
        /* wrong */
        int c = 128;
        byte d = (byte) c; /* byte -128 > 127 */
        System.out.println(c);
        System.out.println(d);
        /* correct */
        int e = 15;
        int f = (byte) e;
        System.out.println(e);
        System.out.println(f);
    }
}