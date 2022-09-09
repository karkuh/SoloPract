package middle;

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
