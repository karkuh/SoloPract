package easy;


//author:karkuh
//You need to calculate the sum of all the multiples of 3 or 5 below a given number.
//
//        Task:
//        Given an integer number, output the sum of all the multiples of 3 and 5 below that number.
//        If a number is a multiple of both, 3 and 5, it should appear in the sum only once.
//        Input Format:
//        An integer.
//        Output Format:
//        An integer, representing the sum of all the multiples of 3 and 5 below the given input.
//        Sample Input:
//        10
//        Sample Output:
//        23

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int output = sc.nextInt();
        int res = 0;
        for (int i = 0; i < output; i++) {
            if (i%3 ==0 || i%5==0 ){
                res += i;
            }
        }
        System.out.println(res);
    }
}
