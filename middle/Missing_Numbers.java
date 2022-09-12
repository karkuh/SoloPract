package middle;


//author: @karkuh
//You are given a list of whole numbers in ascending order.
// You need to find which numbers are missing in the sequence.
//
//        Task:
//        Create a program that takes in a list of numbers and outputs the missing numbers in the sequence separated by spaces.
//        Input Format:
//        The first input denotes the length of the list (N). The next N lines contain the list elements as integers.
//        Output Format:
//        A string containing a space-separated list of the missing numbers.
//        Sample Input:
//        5
//        2
//        4
//        5
//        7
//        8
//        Sample Output:
//        3 6

import java.util.Scanner;

public class Missing_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        int num [] = new int[len];
        for (int i = 0; i < len ; i++) {
            num[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = num[0]; i < num[num.length-1] ; i++) {

            if (num[j]==i){
                j++;
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
