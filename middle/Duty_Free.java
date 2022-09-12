package middle;


//author: @karkuh
//You make a purchase of souvenirs priced in Euros at a duty free store in the Rome airport.
//You didn't want to spend any more than 20 US Dollars on any specific item.
//        Can you go through your list and make sure you stayed under your limit?
//        The conversion rate on this day is 1.1 US Dollars to 1 Euro.
//
//        Task:
//        Evaluate each item that you purchased to make sure that you didn't spend more than $20 on that particular item.
//        If you did, you will need to go back to the store to return it.
//        Input Format:
//        An string of numbers separated by spaces that represent the prices of each of your items in Euros.
//        Output Format:
//        A string that says 'On to the terminal' if you stayed under your cap, or 'Back to the store' if you spent too much money.
//        Sample Input:
//        18 15.50 2 14
//        Sample Output:
//        On to the terminal

import java.util.Scanner;

public class Duty_Free {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String price = sc.nextLine();
        String  [] price_array = (price.split(" "));
        int temp = 0 ;
        for (int i = 0; i < price_array.length ; i++) {
            if (Float.parseFloat(price_array[i])*1.1 > 20){
                System.out.println("Back to the store");
                temp++;
                break;
            }
        }
        if (temp == 0){
            System.out.println("On to the terminal");
        }

    }
}
