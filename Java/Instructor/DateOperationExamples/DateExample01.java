package Java.Instructor.DateOperationExamples;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample01 {

    public static void main(String[] args) {
        Calendar start_date = Calendar.getInstance();
        GregorianCalendar end_date = new GregorianCalendar(2025, 06, 31);

        start_date.set(2024, 9, 31);

        System.out.println(start_date);
        System.out.println(end_date);

        System.out.println(end_date.compareTo(start_date));


    }
    
}
