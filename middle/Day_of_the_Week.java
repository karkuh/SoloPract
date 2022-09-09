package middle;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Day_of_the_Week {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] date_array = new String[3];
        if (date.length() <=10){
             date_array = date.split("/");
        }else {
            String [] temp = date.split(", ");
            date_array[2] = temp[1];
            String [] temp2 = temp[0].split(" ");
            date_array[1] = temp2[1];
            if (temp2[0].equals("January")){
                date_array[0] = "1";
            }else if (temp2[0].equals("February")){
                date_array[0] = "2";
            }else if (temp2[0].equals("March")){
                date_array[0] = "3";
            }else if (temp2[0].equals("April")){
                date_array[0] = "4";
            }else if (temp2[0].equals("May")){
                date_array[0] = "5";
            }else if (temp2[0].equals("June")){
                date_array[0] = "6";
            }else if (temp2[0].equals("July")){
                date_array[0] = "7";
            }else if (temp2[0].equals("August")){
                date_array[0] = "8";
            }else if (temp2[0].equals("September")){
                date_array[0] = "9";
            }else if (temp2[0].equals("October")){
                date_array[0] = "10";
            }else if (temp2[0].equals("November")){
                date_array[0] = "11";
            }else if (temp2[0].equals("December")){
                date_array[0] = "12";
            }
        }
        Calendar c = new GregorianCalendar(Integer.parseInt(date_array[2]), Integer.parseInt(date_array[0]), Integer.parseInt(date_array[1]));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == 1){
            System.out.println("Thursday");
        }else if (dayOfWeek == 2){
            System.out.println("Friday");
        }else if (dayOfWeek == 3){
            System.out.println("Saturday");
        }else if (dayOfWeek == 4){
            System.out.println("Sunday");
        }else if (dayOfWeek == 5){
            System.out.println("Monday");
        }else if (dayOfWeek == 6){
            System.out.println("Tuesday");
        }else if (dayOfWeek == 7){
            System.out.println("Wednesday");
        }

    }
}
