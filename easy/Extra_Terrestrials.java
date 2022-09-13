package easy;


//author:karkuh
//You meet a group of aliens, and their language is just like English except that they say every word backwards.
//        How will you learn to communicate with them?
//
//        Task:
//        Take a word in English that you would like to say, and turn it into language that these aliens will understand.
//        Input Format:
//        A string of a word in English.
//        Output Format:
//        A string of the reversed word that represents the original word translated into alien language.
//        Sample Input:
//        howdy
//        Sample Output:
//        ydwoh

import java.util.Scanner;

public class Extra_Terrestrials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] wordarray = word.toCharArray();
        for (int i = 0; i < wordarray.length / 2; i++) {
            char temp = wordarray[i];
            wordarray[i] = wordarray[wordarray.length - 1 - i];
            wordarray[wordarray.length - 1 - i] = temp;
        }

        word = new String(wordarray);
        System.out.println(word);
    }
}
