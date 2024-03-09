public class lesson_6 {
    public static void main(String[] args) {
        /* Logic operations */
        /* AND (&&) True only when both are True */
        /* OR (||) True when one of them is True */
        /* NOT (!)  */

        int i = 15;
        System.out.println("i=15;\nCheck if i>0 and i<10");
        System.out.println(i>0 && i<10);
        System.out.println("Check if i>10 or i<-1");
        System.out.println(i>10 || i<-1);
        System.out.println("NOT operator:");
        System.out.println(!(i>10 || i<-1));
    }
}
