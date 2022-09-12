package middle;


//author: @karkuh
//Your favorite store is having a sale! You pay full price for the most expensive item that you get,
// but then you get 30% off of everything else in your purchase! How much are you going to save?
//        Sales tax is 7%.
//        Also, you leave anything below a dollar in your saving as a tip to the seller.
//        If your saving is a round amount, you don't leave any tips.
//
//        Task:
//        Given the prices of items you want to purchase, determine how much you will save during your shopping!
//        Input Format:
//        An string of numbers separated by commas that represent the prices for all of the items that you want to purchase (without tax).
//        Output Format:
//        An integer number that represents the total savings that you got for shopping during the sale.
//        Sample Input:
//        100.25,80.99,40.00
//        Sample Output:
//        38

import java.util.Scanner;

public class Super_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = sc.next();
        String [] menu_array = (menu.split(","));
        float[] num_array = new float[menu_array.length];
        float max = Float.parseFloat(menu_array[0]);
        float sum = 0 ;
        for (int i = 0; i < num_array.length; i++) {
            num_array[i] = Float.parseFloat(menu_array[i]);
            sum += num_array[i];
            if ( num_array[i] > max){
                max = num_array[i];
            }
        }

        sum -= max;
        sum += sum*0.07;
        int res = (int) (sum*0.3);

        System.out.println(res);




    }
}
