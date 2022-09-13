package easy;


//author:karkuh
//You run a hovercraft factory. Your factory makes ten hovercrafts in a month.
// Given the number of customers you got that month, did you make a profit? It costs you 2,000,000 to build a hovercraft,
// and you are selling them for 3,000,000. You also pay 1,000,000 each month for insurance.
//
//        Task:
//        Determine whether or not you made a profit based on how many of the ten hovercrafts you were able to sell that month.
//        Input Format:
//        An integer that represents the sales that you made that month.
//        Output Format:
//        A string that says 'Profit', 'Loss', or 'Broke Even'.
//        Sample Input:
//        5
//        Sample Output:
//        Loss

import java.util.Scanner;

public class Hovecraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all = (2000000 * 10) + 1000000;

        int buyer = sc.nextInt();
        int cost = buyer * 3000000;
        if (cost > all) {
            System.out.println("Profit");
        } else if (cost == all) {
            System.out.println("Broke even");
        } else {
            System.out.println("Loss");
        }

    }
}
