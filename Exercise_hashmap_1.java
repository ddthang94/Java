import java.util.HashMap;
import java.util.Scanner;

public class Exercise_hashmap_1 {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("user1","123456a");
        dict.put("user2","123456b");
        dict.put("user3","123456c");
        dict.put("user4","123456d");
        dict.put("user5","123456e");
        dict.put("user6","123456f");
        dict.put("user7","123456g");
        dict.put("user8","123456h");
        dict.put("user9","123456i");
        dict.put("user10","123456k");

        System.out.print("Enter user name: ");
        String userName = new Scanner(System.in).nextLine();
        System.out.print("Enter password: ");
        String password = new Scanner(System.in).nextLine();

        /* check password */
        if (!dict.containsKey(userName)) {
            System.out.println(userName+" is not available!");
        } else if (!dict.get(userName).equals(password)) {
            System.out.println("Password is incorrect!");
        } else {
            System.out.println("Successfully signin!");
        }
    }
}