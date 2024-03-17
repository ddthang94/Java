public class Exercise_doubleFor {
    public static void main(String[] args) {
        /* matrix 4x4 '*' */
        System.out.println("1. Matrix 4x4");
        for (int i=1;i<=4;i++) {
            for (int j=1;j<=4;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }

        /* Square */
        System.out.println("2. Square");
        for (int i=1;i<=4;i++) {
            for (int j=1;j<=4;j++) {
                if (i==1||i==4||j==1||j==4)
                    System.out.print("*"+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");
        }

        /* Triangle bottom-left */
        System.out.println("3. Triangle bottom-left");
        for (int i=1;i<=4;i++) {
            for (int j=1;j<=i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }

        /* Triangle missing i==3 j==2 */
        System.out.println("4. Triangle missing i==3 j==2 ");
        for (int i=1;i<=4;i++) {
            for (int j=1;j<=i;j++){
                if (i==3 && j==2)
                    System.out.print(" "+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }

        /* Triangle top-left */
        System.out.println("5. Triangle top-left");
        for (int i=1;i<=4;i++) {
            for (int j=4;j>=i;j--) {
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }

        /* Triangle missing i==2 j==3 */
        System.out.println("6. Triangle missing i==2 j==3 ");
        for (int i=1;i<=4;i++) {
            for (int j=4;j>=i;j--) {
                if (i==2 && j==3)
                    System.out.print(" "+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }

        /* Triangle bottom-right */
        System.out.println("7. Triangle bottom-right");
        for (int i=4;i>=1;i--) {
            for (int j=1;j<=4;j++) {
                if (i>j)
                    System.out.print(" "+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
    }
}
