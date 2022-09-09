package middle;

import java.util.Scanner;

public class Secret_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        char[] word_array = word.toCharArray();
        for (int i = 0; i < word_array.length; i++) {
            if (word_array[i] == 'a') {
                word_array[i] = 'z';
            } else if (word_array[i] == 'b') {
                word_array[i] = 'y';
            } else if (word_array[i] == 'c') {
                word_array[i] = 'x';
            } else if (word_array[i] == 'd') {
                word_array[i] = 'w';
            } else if (word_array[i] == 'e') {
                word_array[i] = 'v';
            } else if (word_array[i] == 'f') {
                word_array[i] = 'u';
            } else if (word_array[i] == 'g') {
                word_array[i] = 't';
            } else if (word_array[i] == 'h') {
                word_array[i] = 's';
            } else if (word_array[i] == 'i') {
                word_array[i] = 'r';
            } else if (word_array[i] == 'j') {
                word_array[i] = 'q';
            } else if (word_array[i] == 'k') {
                word_array[i] = 'p';
            } else if (word_array[i] == 'l') {
                word_array[i] = 'o';
            } else if (word_array[i] == 'm') {
                word_array[i] = 'n';
            } else if (word_array[i] == 'n') {
                word_array[i] = 'm';
            } else if (word_array[i] == 'o') {
                word_array[i] = 'l';
            } else if (word_array[i] == 'p') {
                word_array[i] = 'k';
            } else if (word_array[i] == 'q') {
                word_array[i] = 'j';
            } else if (word_array[i] == 'r') {
                word_array[i] = 'i';
            } else if (word_array[i] == 's') {
                word_array[i] = 'h';
            } else if (word_array[i] == 't') {
                word_array[i] = 'g';
            } else if (word_array[i] == 'u') {
                word_array[i] = 'f';
            } else if (word_array[i] == 'v') {
                word_array[i] = 'e';
            } else if (word_array[i] == 'w') {
                word_array[i] = 'd';
            } else if (word_array[i] == 'x') {
                word_array[i] = 'c';
            } else if (word_array[i] == 'y') {
                word_array[i] = 'b';
            } else if (word_array[i] == 'z') {
                word_array[i] = 'a';
            }
            System.out.print(word_array[i]);
        }
    }
}