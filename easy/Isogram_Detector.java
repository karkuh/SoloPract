package easy;


//author:karkuh
//An isogram is a word that has no repeating letters, whether they are consecutive or non-consecutive.
//        Your job is to find a way to detect if a word is an isogram.
//
//        Task: Write a program that takes in a string as input, detects if the string is an isogram and outputs true or false based on the result.
//        Input Format:
//        A string containing one word.
//        Output Format:
//        A string: true or false.
//        Sample Input:
//        turbulence
//        Sample Output:
//        false

import java.util.Scanner;

public class Isogram_Detector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        char [] src_array = src.toCharArray();
        boolean res = true;
        for (int i = 0; i < src_array.length; i++) {
            for (int j = i+1; j < src_array.length; j++) {
                if (src_array[i]==src_array[j]){
                    res = false;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
