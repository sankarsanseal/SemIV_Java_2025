package Java.Instructor.DateOperationExamples;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class DateExample2 {

    public static void main(String[] args) {
        
        LocalDate start_date = LocalDate.of(2025, 01, 31);
        System.out.println("Start Date:" + start_date);

        LocalDate end_date = LocalDate.now();

        System.out.println("End Date:"+end_date);


        Period date_difference = Period.between(start_date, end_date);

        System.out.println("Number of days betweeb two Days:"+date_difference.getDays());
        System.out.println("Number of days betweeb two Months:"+date_difference.getMonths());

        System.out.println("Number of days betweeb two Years:"+date_difference.getYears());

        long day_differences = ChronoUnit.DAYS.between(start_date, end_date);

        System.out.println("Number of days between two days:" + day_differences);

    }
    
}
