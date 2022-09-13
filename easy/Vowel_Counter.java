package easy;


//author:karkuh
//You are in an English class, your teacher tells the class that vowels are the glue that hold words and sentences together.
//They want to make sure you understand the importance of vowels in a sentence.
// You are given example sentences and are to give a total amount of vowels that are in each sentence.
//
//        Task:
//        Write a program that takes in a string as input, counts and outputs the number of vowels (A, E, I, O, U).
//        Input Format:
//        A string (letters can be both uppercase or lower case).
//        Output Format:
//        A number which represents the total number of vowels in the string.
//        Sample Input:
//        this is a sentence
//        Sample Output:
//        6

import java.util.Scanner;

public class Vowel_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        src = src.toLowerCase();
        char [] src_array = src.toCharArray();

        int res = 0;
        for (int i = 0; i <src_array.length ; i++) {
            if (src_array[i] == 'a' || src_array[i] == 'e' || src_array[i] == 'i' || src_array[i] == 'o' || src_array[i] == 'u'  ){
                res++;
            }
        }
        System.out.println(res);

    }
}
