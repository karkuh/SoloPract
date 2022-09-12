package middle;


//author: @karkuh
//You are given a word and want to split it into even parts based on a number that is provided,
// each half being the size of the number.
//
//        Task:
//        Write a program that takes in a string, and a number as input.
//        Split the string into even parts sized by the number, and output the parts separated by hyphens.
//        The last part of the output will be any leftover, as the input string might not split into the provided parts evenly.
//        Input Format:
//        Two inputs: a string and an integer.
//        Output Format:
//        A string, representing the hyphen-separated parts.
//        Sample Input:
//        hello
//        2
//        Sample Output:
//        he-ll-o

import java.util.Scanner;

public class Splitting_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        int split = sc.nextInt();
        StringBuilder bf = new StringBuilder();
        char[] src_array = src.toCharArray();

        for (int i = 0; i <src_array.length ; i++) {
            bf.append(src_array[i]);
            if (i == src_array.length-1){
                break;
            }
            if ((i+1) % split == 0){
                bf.append("-");
            }
        }
        System.out.println(bf);

    }
}
