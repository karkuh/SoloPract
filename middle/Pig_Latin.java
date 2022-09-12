package middle;


//author: @karkuh
//You have two friends who are speaking Pig Latin to each other!
// Pig Latin is the same words in the same order except that you take the first letter of each word and put it on the end,
// then you add 'ay' to the end of that. ("road" = "oadray")
//
//        Task
//        Your task is to take a sentence in English and turn it into the same sentence in Pig Latin!
////        Input Format
//        A string of the sentence in English that you need to translate into Pig Latin. (no punctuation or capitalization)
//        Output Format
//        A string of the same sentence in Pig Latin.
//        Sample Input
//        "nevermind youve got them"
//        Sample Output
//        "evermindnay ouveyay otgay hemtay"

import java.util.Scanner;

public class Pig_Latin {
    public static void main(String[] args) {
        StringBuilder bf = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(string);
        String[] string_array = string.split(" ");
        for (int i = 0; i < string_array.length; i++) {
            char[] init = string_array[i].toCharArray();
            for (int j = 1; j < init.length; j++) {
                bf.append(init[j]);
            }
            bf.append(init[0]);
            bf.append("ay");
            bf.append(" ");

        }
        System.out.println(bf);
    }
}
