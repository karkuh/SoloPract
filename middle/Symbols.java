package middle;


//author: @karkuh
//There is a problem with your keyboard: it randomly writes symbols when you are typing a text.
// You need to clean up the text by removing all symbols.
//
//        Task:
//        Take a text that includes some random symbols and translate it into a text that has none of them. The resulting text should only include letters and numbers.
//        Input Format:
//        A string with random symbols.
//        Output Format:
//        A string of the text with all the symbols removed.
//        Sample Input:
//        #l$e%ts go @an#d@@ g***et #l#unch$$$
//        Sample Output:
//        lets go and get lunch

import java.util.Scanner;

public class Symbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word.replaceAll("[^A-Za-z0-9 ]", ""));
    }
}
