public class Student {
    /* Attributes */
    /* Rules: following name convention,
    set private if we don't want to inherit
    set protected if we do want to inherit
    should not set public */
    private String fullName;
    private double grade;
    /* Methods (functions) */
    public void displayInformation() {
        System.out.println(fullName+" : "+grade);
    }
}
