package eNum;

public enum Comparison {
    excellent ("Xuat sac"),  //1
    good ("Gioi"),    //2
    passed ("Dat"),     //3
    failed ("Xit");      //4

    /* tag a message */
    private final String msg;
    Comparison(String msg) {
        this.msg=msg;
    }
    /* return message */
    public String des() {
        return this.msg;
    }
}
