package easy;


//author:karkuh
//You and three friends go to a baseball game and you offer to go to the concession stand for everyone.
// They each order one thing, and you do as well. Nachos and Pizza both cost $6.00. A Cheeseburger meal costs $10.
// Water is $4.00 and Coke is $5.00. Tax is 7%.
//
//        Task
//        Determine the total cost of ordering four items from the concession stand. If one of your friend’s orders something that isn't on the menu, you will order a Coke for them instead.
//        Input Format
//        You are given a string of the four items that you've been asked to order that are separated by spaces.
//        Output Format
//        You will output a number of the total cost of the food and drinks.
//        Sample Input
//        'Pizza Cheeseburger Water Popcorn'
//        Sample Output
//        26.75

import java.util.Scanner;

public class Ballpark_Orders {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choise = sc.nextLine();
        String[] choiseArray = choise.split(" ");
        float sum = 0;
        for (int i = 0; i < choiseArray.length; i++) {
            if (choiseArray[i].equals("Nachos") || choiseArray[i].equals("Pizza")) {
                sum += 6;
            } else if (choiseArray[i].equals("Cheeseburger")) {
                sum += 10;
            } else if (choiseArray[i].equals("Water")) {
                sum += 4;
            } else if (choiseArray[i].equals("Coke")) {
                sum += 5;
            } else {
                sum += 5;
            }


        }

        sum += sum * 0.07;
        System.out.println(sum);
    }
}
