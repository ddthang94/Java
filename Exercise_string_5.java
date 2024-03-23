public class Exercise_string_5 {
    public static void main(String[] args) {
        /* String a = "I work hard I am handsome I am smart"
        * Counting "I" in String a */
        String a = "I work hard I am handsome I am smart";
        String[] words = a.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.equals("I")) {
                count++;
            }
        }
        /* display result */
        System.out.println("I appear "+count+ " times");
    }
}
