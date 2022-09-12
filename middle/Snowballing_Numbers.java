package middle;

//author: @karkuh
//You are given a list of numbers in a particular order.
// You need to check to see if each number is greater than the sum of all the previous number of the list.
//        If they are, you have created successful snowball numbers.
//
//        Task:
//        Create a program that takes in an array of numbers, check if each number is greater than the sum of all previous numbers, and output true if the condition is met, and false, if not.
//        Input Format:
//        The first input denotes the length of the list (N). The next N lines contain the list elements as integers.
//        Output Format:
//        A string, true or false.
//        Sample Input:
//        4
//        1
//        3
//        7
//        58
//        Sample Output:
//        true

import java.util.Scanner;

public class Snowballing_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < len ; i++) {
         arr[i] = sc.nextInt();
         if (i>0){
             if (arr[i]<sum){
                 System.out.println("false");
                 temp++;
                 break;
             }
         }
         sum += arr[i];
        }
        if (temp==0){
            System.out.println("true");
        }
    }
}
