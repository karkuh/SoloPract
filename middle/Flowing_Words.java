package middle;


//author: @karkuh
//If a sentence flows, the first letter of each word will be the same to the last letter of the previous word.
//
//        Task:
//        Write a program that takes in a string that contains a sentence, checks if the first letter of each word is the same as the last letter of the previous word. If the condition is met, output true, if not, output false.
//        Casing does not matter.
//        Input Format:
//        A string containing a sentence of words.
//        Output Format:
//        A string: true or false.
//        Sample Input:
//        this string gets stuck
//        Sample Output:
//        true

import java.util.Scanner;

public class Flowing_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String[] src_array = src.split(" ");
        int res = 0;
        for (int i = 0; i < src_array.length-1; i++) {

            if (src_array[i].charAt(src_array[i].length()-1) == src_array[i+1].charAt(0)){
                res++;
            }
        }
        if (res == src_array.length-1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
