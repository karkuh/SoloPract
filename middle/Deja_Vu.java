package middle;

//author: @karkuh
//You aren't paying attention and you accidentally type a bunch of random letters on your keyboard.
// You want to know if you ever typed the same letter twice, or if they are all unique letters.
//
//        Task:
//        If you are given a string of random letters, your task is to evaluate whether any letter is repeated in the string or if you only hit unique keys while you typing.
//        Input Format:
//        A string of random letter characters (no numbers or other buttons were pressed).
//        Output Format:
//        A string that says 'Deja Vu' if any letter is repeated in the input string, or a string that says 'Unique' if there are no repeats.
//        Sample Input:
//        aaaaaaaghhhhjkll
//        Sample Output:
//        Deja Vu

import java.util.Scanner;

public class Deja_Vu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] word_array = word.toCharArray();

        int temp = 0;
        for (int i = 0; i < word_array.length; i++) {
            for (int j = 0; j < word_array.length; j++) {
                if (i == j){
                    continue;
                }
                if (word_array[i] == word_array[j]) {
                    System.out.println("Deja Vu");
                    temp++;
                    break;
                }
            }
            if (temp == 1){
                break;
            }
        }

        if (temp==0){
            System.out.println("Unique");
        }

    }
}
