package middle;

//author: @karkuh
//You need to calculate exactly how many days have passed between two dates.
//
//        Task:
//        Calculate how many days have passed between two input dates, and output the result.
//        Input Format:
//        Two strings that represent the dates, first date should be the older date.
//        Date format: Month DD, YYYY
//        Output Format:
//        A number representing the number of days between the two dates.
//        Sample Input:
//        August 15, 1979
//        June 15, 2018
//        Sample Output:
//        14184

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

import static java.time.temporal.ChronoUnit.DAYS;

public class Days_between_dates {
    public static void main(String[] args) throws ParseException {


        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US);
        Scanner sc = new Scanner(System.in);
        LocalDate firstDate = LocalDate.parse(sc.nextLine(), formatter);
        LocalDate secondDate = LocalDate.parse(sc.nextLine(), formatter);

         long days = firstDate.until(secondDate, DAYS);
        System.out.println(days);
    }
}
