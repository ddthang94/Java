import java.util.Calendar;
import java.util.Scanner;

public class Exercise_ls20_1 {
    public static void main(String[] args) {
        /* enter date of birth and display your age */
        int date, month, year, age;
        System.out.println("Enter date of birth: ");
        date = new Scanner(System.in).nextInt();
        System.out.println("Enter month of birth: ");
        month = new Scanner(System.in).nextInt();
        System.out.println("Enter year of birth: ");
        year = new Scanner(System.in).nextInt();

        /* initialize */
        Calendar birthday = Calendar.getInstance();
        /* get/set date month year of birth from user */
        birthday.set(year, month-1,date);
        /* display birthday */
        int yearOfBirth = birthday.get(Calendar.YEAR);
        int monthOfBirth = birthday.get(Calendar.MONTH);
        int dateOfBirth = birthday.get(Calendar.DATE);
        System.out.println("Your birthday: "+dateOfBirth+"/"+(monthOfBirth+1)+"/"+yearOfBirth);
        /* calculate your age */
        /* get current year */
        Calendar current = Calendar.getInstance();
        int currentYear = current.get(Calendar.YEAR);
        age = currentYear-yearOfBirth;
        System.out.println("Your age is "+age);
    }
}
