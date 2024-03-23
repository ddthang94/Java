public class Exercise_string_2 {
    public static void main(String[] args) {
        /* String str1 = "English = 78 Science = 83 Math = 68 History = 65" */
        /* 1. Find the sum of all number from string above */
        /* 2. Find average */
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int Sum = 0;
        int count = 0;
        /* Use spit to get elements */
        String[] parts = str1.split(" ");
        for (String element : parts) {
            System.out.println(element);
            try {
                /* Use parseInt() to convert string to integer number */
                int num = Integer.parseInt(element);
                Sum+=num;
                count++;
            } catch (NumberFormatException ev) {
                /* do nothing */
            }
        }
        /* Sum */
        System.out.println("The sum is "+Sum);
        /* Average */
        double average = (double) Sum / count;
        System.out.println("The average is "+average);
    }
}
