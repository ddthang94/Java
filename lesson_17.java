public class lesson_17 {
    public static void main(String[] args) {
        /* double for loop */
        for (int i=1;i<=7;i++) {
            for (int j=1;j<=7;j++) {
                System.out.print(i+""+j+"\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        /* Draw N */
        for (int i=1;i<=7;i++) {
            for (int j=1;j<=7;j++) {
                if (j==1 || j==7 || i==j )
                    System.out.print(i+""+j+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        /* Draw square */
        for (int i=1;i<=7;i++) {
            for (int j=1;j<=7;j++) {
                if (j==1 || j==7 || i==1 || i==7)
                    System.out.print("*"+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        /* Draw triangle */
        for (int i=1;i<=7;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(i+""+j+"\t");
            }
            System.out.println("");
        }
    }
}
