public class lesson_24 {
    public static void main(String[] args) {
        /* string */
        String s = "Hello world!" + "\nHi!";
        System.out.println(s);
        /* initialize */
        StringBuilder sb = new StringBuilder();
        /* append(string) - adding string at the end */
        sb.append("How are you?");
        sb.append(" Are you OK?");
        sb.append("; I am glad to see you!");
        System.out.println(sb);
        /* insert(index,string) - adding string at the index */
        sb.insert(0,"Hi, ");
        System.out.println(sb);
        /* delete(start,end) - delete all characters from start to end-1 */
        sb.delete(16,28);
        System.out.println(sb);
        /* string.length() - return the length of a string including whiteSpace */
        System.out.println(sb.length());
    }
}
