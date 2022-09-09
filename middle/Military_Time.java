package middle;

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
