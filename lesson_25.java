public class lesson_25 {
    public static void main(String[] args) {
        String str = "I am looking for myself. am I wrong?";

        /* indexOf - check the index of where the char or string first appear
        * return -1 if there is no char or string */
        System.out.println(str.indexOf("am"));

        /* LastIndexOf - return the index of where the char or string last appear
        * return -1 if there is no char or string */
        System.out.println(str.lastIndexOf("am"));

        /* contains - check the subString */
        String str1 = ".mp3";
        String str2 = "youtube.mp4";
        boolean check = str2.contains(str1);
        if (check)
            System.out.println("str1 can be found inside str2 ");
        else
            System.out.println("str1 cannot be found inside str2");

        /* substring - get a substring from a string:
        substring(int beginIndex)
        substring(int beginIndex, int endIndex) */
        String str3 = "assgabaa";
        String str4 = str3.substring(4);
        String str5 = str3.substring(2,5);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println("=======");

        /* replace("str old", "str new") */
        String str6 = "I am looking forward! Am I correct?";
        String str7 = str6.replace("I", "You");
        System.out.println(str6);
        System.out.println(str7);
        System.out.println("=======");

        /* replaceFirst("str old", "str new") */
        String str8 = "I am looking forward! Am I correct?";
        String str9 = str6.replaceFirst("I", "You");
        System.out.println(str8);
        System.out.println(str9);
        System.out.println("=======");

        /* trim() - remove all white space at the beginning of paragraph */
        String str10 = "           Lets go...!!!";
        String str11 = str10.trim();
        System.out.println(str10);
        System.out.println(str11);
        System.out.println("=======");

        /* Using trim() to remove all white space at the end of paragraph */
        String str12 = "Let's go...!!!!!!!!         ";
        String str13 = str12.replaceAll("\\s+$","");
        System.out.println(str12);
        System.out.println(str12.length());
        System.out.println(str13);
        System.out.println(str13.length());
        System.out.println("=======");

        /* Remove all white space at the beginning - regular expression */
        String str14 = "     I am the winner!!!         ";
        String str15 = str14.replaceFirst("^\\s+","");
        System.out.println(str14);
        System.out.println(str15);
        System.out.println("=======");

        /* Remove all white space at the beginning - using while loop */
        String str16 = "        Remove white space using while loop      ";
        System.out.println(str16);
        while (str16.startsWith(" ")) {
            str16 = str16.substring(1);
        }
        System.out.println(str16);
        System.out.println("=======");

        /* compareTo() and compareToIgnoreCase() */
        String str17 = "abc13579";
        String str18 = "abc13579";
        int x = str17.compareTo(str18);  // return x=0
        System.out.println("x="+x+" Two strings has no differences.");
        System.out.println("=======");

        String str19 = "Abc13579";
        String str20 = "abc13579";
        int x1 = str19.compareTo(str20);
        System.out.println("x1="+x1+" Two strings are different.");
        System.out.println("=======");

        String str21 = "Abc13579";
        String str22 = "abc13579";
        int x2 = str21.compareToIgnoreCase(str22);
        System.out.println("x2="+x2+" Two strings are different but ignore case sensitive");
        System.out.println("=======");

        /* Using StringBuilder() */
        /* Initialize */
        StringBuilder sb = new StringBuilder("Today, ");
        System.out.println(sb);
        /* Insert */
        sb.insert(2," raining ");
        System.out.println(sb);
        /* Append */
        StringBuilder sb1 = new StringBuilder("1234");
        System.out.println(sb1);
        sb1.append(" 56789");
        System.out.println(sb1);
        /* Delete from..to.. */
        StringBuilder sb2 = new StringBuilder("0123456789");
        System.out.println(sb2);
        sb2.delete(1,3);
        System.out.println(sb2);
        /* reverse() */
        StringBuilder sb3 = new StringBuilder("123456789");
        System.out.println(sb3);
        sb3.reverse();
        System.out.println(sb3);
        System.out.println("=======");
        /* cannot reverse this string below, so we need to create obj using StringBuilder */
        String str27 = "123456789abc";
        System.out.println(str27);
        StringBuilder sb4 = new StringBuilder(str27);
        sb4.reverse();
        System.out.println(sb4);
        System.out.println("=======");

        /* split */
        String sp = "Hello world!";
        String[] arr = sp.split(" ");
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=======");

        /* lowercase() and uppercase() */
        String str23 = "I am WINNER!";
        System.out.println(str23);
        String str24 = str23.toLowerCase();
        System.out.println("To lower case: "+str24);
        String str25 = str24.toUpperCase();
        System.out.println("To upper case: "+str25);
        System.out.println("=======");

        /* toCharArray() - check password */
        String str26 = "@agas12345678";
        char[] arr1 = str26.toCharArray();
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n=======");
    }
}