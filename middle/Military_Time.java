package middle;


//author: @karkuh
//You want to convert the time from a 12 hour clock to a 24 hour clock. If you are given the time on a 12 hour clock,
// you should output the time as it would appear on a 24 hour clock.
//
//        Task:
//        Determine if the time you are given is AM or PM, then convert that value to the way that it would appear on a 24 hour clock.
//        Input Format:
//        A string that includes the time, then a space and the indicator for AM or PM.
//        Output Format:
//        A string that includes the time in a 24 hour format (XX:XX)
//        Sample Input:
//        1:15 PM
//        Sample Output:
//        13:15

import java.util.Scanner;

public class Military_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String [] time_array = time.split(" ");
        String [] hours = time_array[0].split(":");
        if (time_array[1].equals("AM") ){
            if (hours[0].length() == 1){
                System.out.println("0" +time_array[0] );
            }else{
                System.out.println(time_array[0]);
            }

        }else{

            if (hours[0].equals("1")){
                System.out.print("13:"+ hours[1]);
            }else if (hours[0].equals("2")){
                System.out.print("14:"+ hours[1]);
            }else if (hours[0].equals("3")){
                System.out.print("15:"+ hours[1]);
            }else if (hours[0].equals("4")){
                System.out.print("16:"+ hours[1]);
            }else if (hours[0].equals("5")){
                System.out.print("17:"+ hours[1]);
            }else if (hours[0].equals("6")){
                System.out.print("18:"+ hours[1]);
            }else if (hours[0].equals("7")){
                System.out.print("19:"+ hours[1]);
            }else if (hours[0].equals("8")){
                System.out.print("20:"+ hours[1]);
            }else if (hours[0].equals("9")){
                System.out.print("21:"+ hours[1]);
            }else if (hours[0].equals("10")){
                System.out.print("22:" + hours[1]);
            }else if (hours[0].equals("11")){
                System.out.print("23:" + hours[1]);
            }else if(hours[0].equals("12" )){
                System.out.print("00:" + hours[1]);
            }
        }

    }
}
