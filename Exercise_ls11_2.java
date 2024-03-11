import java.util.Scanner;

public class Exercise_ls11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Search by name.");
        System.out.println("2. Search by author.");
        System.out.println("3. Search by publisher.");
        System.out.println("4. Search by title.");
        System.out.println("========================");
        System.out.println("Please select an option: ");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("Searching by name ... ");
                break;
            case 2:
                System.out.println("Searching by author ... ");
                break;
            case 3:
                System.out.println("Searching by publisher ... ");
                break;
            case 4:
                System.out.println("Searching by title ... ");
                break;
            default:
                System.out.println("The option isn't available. Exit!");
                break;
        }
    }
}
