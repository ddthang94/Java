import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class lesson_20 {
    public static void main(String[] args) {
        /* date time library */
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        /* month from 0 to 11, so we need to add 1 */
        int month = cal.get(Calendar.MONTH);
        System.out.println(month+1);
        int date = cal.get(Calendar.DATE);
        System.out.println(date);

        System.out.println();

        /* Using get and set to change the calendar and display the new value */
        cal.set(Calendar.YEAR,1994);
        int y = cal.get(Calendar.YEAR);

        cal.set(Calendar.MONTH,11);
        int m = cal.get(Calendar.MONTH);

        cal.set(Calendar.DATE,21);
        int d = cal.get(Calendar.DATE);
        System.out.println("Date of birth: " +y+"/"+m+"/"+d);

        /* display as customized format */
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date D = cal.getTime();
        String f = format.format(D);
        System.out.println(f);
    }
}
