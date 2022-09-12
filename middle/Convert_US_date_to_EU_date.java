package middle;

//author: @karkuh
//You and your friends are going to Europe! You have made plans to travel around Europe with your friends,
// but one thing you need to take into account so that everything goes according to play,
// is that the format of their date is different than from what is used in the United States.
// Your job is to convert all your dates from MM/DD/YYYY to DD/MM/YYYY.
//
//        Task:
//        Create a function that takes in a string containing a date that is in US format, and return a string of the same date converted to EU.
//        Input Format:
//        A string that contains a date formatting 11/19/2019 or November 19, 2019.
//        Output Format:
//        A string of the same date but in a different format: 19/11/2019.
//        Sample Input:
//        7/26/2019
//        Sample Output:
//        26/7/2019

import java.util.Scanner;

public class Convert_US_date_to_EU_date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        char[] array = date.toCharArray();

        if (array[array.length-5] == '/') {
            String[] date_array = date.split("/");
            System.out.println(date_array[1] + "/" + date_array[0] + "/" + date_array[2]);
        }else{
            String[] date_array_1 = date.split(", ");
            String[] date_array_2 = date_array_1[0].split(" ");
            System.out.print(date_array_2[1] + "/");
            if (date_array_2[0].toLowerCase().equals("january")) {
                System.out.print("1/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("february")) {
                System.out.print("2/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("march")) {
                System.out.print("3/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("april")) {
                System.out.print("4/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("may")) {
                System.out.print("5/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("june")) {
                System.out.print("6/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("july")) {
                System.out.print("7/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("august")) {
                System.out.print("8/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("september")) {
                System.out.print("9/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("october")) {
                System.out.print("10/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("november")) {
                System.out.print("11/" + date_array_1[1]);
            } else if (date_array_2[0].toLowerCase().equals("december")) {
                System.out.print("12/" + date_array_1[1]);
            }
        }

    }
}
