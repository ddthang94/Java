public class lesson_21 {
    public static void main(String[] args) {
        /* MATH in Java */
        /* PI */
        System.out.println("PI "+Math.PI);
        /* Absolute value */
        int a = -2;
        System.out.println(Math.abs(a));
        /* max, min */
        System.out.println(Math.max(4,9));
        System.out.println(Math.min(4,9));
        /* square root */
        System.out.println(Math.sqrt(4));
        /* power/exponential */
        System.out.println(Math.pow(2,3));
        /* sin,cos,tang */
        int degree = 90;
        /* convert Degree to Radian: Math.PI*Degree/180 */
        double sin = Math.sin(Math.PI*degree/180);
        System.out.println("Sin of "+degree+" degree is "+sin);
        double cos = Math.cos(Math.PI*degree/180);
        System.out.println("Cos of "+degree+" degree is "+cos);
        double tan = Math.tan(Math.PI*degree/180);
        System.out.println("Tan of "+degree+" degree is "+tan);
    }
}
