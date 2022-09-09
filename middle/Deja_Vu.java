package middle;

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
