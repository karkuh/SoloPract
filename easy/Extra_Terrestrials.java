package easy;

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
