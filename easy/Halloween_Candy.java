package easy;


//author:karkuh
//You go trick or treating with a friend and all but three of the houses that you visit are giving out candy.
// One house that you visit is giving out toothbrushes and two houses are giving out dollar bills.
//
//        Task
//        Given the input of the total number of houses that you visited, what is the percentage chance that one random item pulled from your bag is a dollar bill?
//        Input Format
//        An integer (>=3) representing the total number of houses that you visited.
//        Output Format
//        A percentage value rounded up to the nearest whole number.
//        Sample Input
//        4
//        Sample Output
//        50

import java.util.Scanner;

public class Halloween_Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float visited_houses = sc.nextFloat();
        float a = 2 / visited_houses;
        float procent = a * 100;
        System.out.println((int) Math.ceil(procent));
    }
}
