public class lesson_18 {
    public static void main(String[] args) {
        /* Try catch finally */
        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println("c= "+c);
        }
        /* catch only arithmetic error */
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException here");
            ex.printStackTrace();
        }
        /* catch all error */
        catch (Exception ex) {
            System.out.println("There is an error!");
            ex.printStackTrace();
        }
        /* run even there is an error */
        finally {
            System.out.println("Always run");
        }
        System.out.println("Something here!!!");
    }
}