package middle;


//author: @karkuh
//You need to know if a number is divisible by each of a group of other numbers.
// If you are given the number and the group of other numbers, you will test to make sure that it is divisible
// by all of them.
//
//        Task:
//        Test your number against all of the other numbers that you are given to make sure that it is divisible by them.
//        Input Format:
//        Two inputs: an integer value (the number you are testing) and a string of variable length of the integers that you should test against separated by spaces.
//        Output Format:
//        A string that says 'divisible by all' or 'not divisible by all'.
//        Sample Input:
//        100
//        2 5 10
//        Sample Output:
//        divisible by all

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String divider = sc.nextLine();
        String[] dividers = divider.split(" ");
        int temp = 0;

        for (int i = 0; i < dividers.length; i++) {
            if ((num) % Integer.parseInt(dividers[i]) != 0) {
                System.out.println("not divisible by all");
                temp++;
                break;
            }
        }
        if (temp == 0) {
            System.out.println("divisible by all");
        }
    }
}
