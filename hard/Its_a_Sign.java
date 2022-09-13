package hard;


//author: @karkuh
//You work in a sign factory, and the machine has started printing all of the signs backwards!
// The signs have already been packed into boxes of four signs each.
// Every letter on every sign is capitalized, so if the original sign was of a palindrome
// (a word or phrase that is the same backwards and forwards) you can still save those signs and not have
// to reprint them. Check each box to see if you should open it up to dig out the sign you can save,
// or if you need to just throw the whole box in the trash.
//
//        Task
//        Given the four words that were supposed to be contained in each box, determine if at least one of them is of a palindrome.
//        Input Format
//        Four strings that represent the word or phrase that was supposed to be printed on the signs inside each box.
//        Output Format
//        A string that say 'Open' if at least one of the boxes is a palindrome or 'Trash' if all of the signs are misprinted.
//        Sample Input
//        CAT
//        MONDAYS
//        RACECAR
//        TACOS
//        Sample Output
//        Open

import java.util.Scanner;

public class Its_a_Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] words = new String[4];
          words[0] = sc.nextLine();
        words[1] = sc.nextLine();
        words[2] = sc.nextLine();
        words[3] = sc.nextLine();
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            char[] words_array = words[i].toCharArray();
            int temp = 0;
            for (int j = 0; j <words_array.length/2 ; j++) {
                if (words_array[j]== words_array[words_array.length-1-j]){
                    temp ++;
                }
            }

            if (temp== words_array.length/2){
                res++;
            }


        }
        if (res>0){
            System.out.println("Open");
        }else {
            System.out.println("Trash");
        }
    }
}
