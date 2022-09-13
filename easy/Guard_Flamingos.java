package easy;


//author:karkuh
//You decide to add a pink flamingo lawn ornament every 2 feet around the perimeter of your yard.
// How many flamingos do you need to purchase?
//
//        Task:
//        Given the length and width of your rectangular yard, determine how many flamingos your should buy to put one every 2 feet along the edges of your yard.
//        Input Format:
//        Two integer values that represent the length and width of your front yard.
//        Output Format:
//        An integer that represents the total number of flamingos that you should purchase.
//        Sample Input:
//        10
//        10
//        Sample Output:
//        20

import java.util.Scanner;

public class Guard_Flamingos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt() *2;
        int width = sc.nextInt() * 2;
        int res = (length + width) / 2;
        System.out.println(res);
    }
}
