public class lesson_2 {
    public static void main(String[] args) {
        System.out.println("============\"8 Primitive datatype\"=============");
        System.out.println("boolean, char, byte, short, int, long, float, double");
        System.out.println("Primitive datatype has a specific size and a specific range of values it can represent");
        System.out.println("=========================");
        System.out.println("Boolean: True or False");
        System.out.println("Char: characters");
        System.out.println("\n============\"Using wrapper class to check MIN, MAX value of number datatype\"=============");
        System.out.println("Byte: 8bit from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short: 16bit from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int: 32bit from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: 64bit from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float: 32bit from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double: 64bit from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("\n============Variable declaration=============");
        /* type of variable name*variable */
        int a;
        byte age;
        float grade;
        /* variables declaration */
        int b, c;
        System.out.println("\n============Variable initialization=============");
        /* type of variable name*variable = value */
        int myAge = 30;
        System.out.println(myAge);
        float grade_2 = 4.5f;
        double grade_3 = 5.0;
        myAge = 31;
        System.out.println(myAge);
        /* final : do not allow to modify the variable */
        final int year = 1994;
    }
}