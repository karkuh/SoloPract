package middle;

import java.util.Scanner;

public class No_Numerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word_with_numbers = sc.nextLine();
        String[] word_with_numbers_array = word_with_numbers.split(" ");
        for (int i = 0; i < word_with_numbers_array.length; i++) {
            if (word_with_numbers_array[i].equals("0")) {
                word_with_numbers_array[i] = "zero";
            } else if (word_with_numbers_array[i].equals("1")) {
                word_with_numbers_array[i] = "one";
            } else if (word_with_numbers_array[i].equals("2")) {
                word_with_numbers_array[i] = "two";
            } else if (word_with_numbers_array[i].equals("3")) {
                word_with_numbers_array[i] = "three";
            } else if (word_with_numbers_array[i].equals("4")) {
                word_with_numbers_array[i] = "four";
            } else if (word_with_numbers_array[i].equals("5")) {
                word_with_numbers_array[i] = "five";
            } else if (word_with_numbers_array[i].equals("6")) {
                word_with_numbers_array[i] = "six";
            } else if (word_with_numbers_array[i].equals("7")) {
                word_with_numbers_array[i] = "seven";
            } else if (word_with_numbers_array[i].equals("8")) {
                word_with_numbers_array[i] = "eight";
            } else if (word_with_numbers_array[i].equals("9")) {
                word_with_numbers_array[i] = "nine";
            } else if (word_with_numbers_array[i].equals("10")) {
                word_with_numbers_array[i] = "ten";
            }

        }

        for (int i = 0; i < word_with_numbers_array.length ; i++) {
            System.out.print(word_with_numbers_array[i] + " ");
        }
    }
}
