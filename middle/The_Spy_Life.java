package middle;

//author: @karkuh
//You are a secret agent, and you receive an encrypted message that needs to be decoded.
// The code that is being used flips the message backwards and inserts non-alphabetic characters in the
// message to make it hard to decipher.
//
//        Task:
//        Create a program that will take the encoded message, flip it around, remove any characters that are not a letter or a space, and output the hidden message.
//        Input Format:
//        A string of characters that represent the encoded message.
//        Output Format:
//        A string of character that represent the intended secret message.
//        Sample Input:
//        d89%l++5r19o7W *o=l645le9H
//        Sample Output:
//        Hello World

import java.util.Scanner;

public class The_Spy_Life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = reverseStringWithRecursion(word);
        System.out.println(word.replaceAll("[^A-Za-z ]", ""));


    }
    public static String reverseStringWithRecursion(String inputString) {
        String rightPart;
        String leftPart;

        int length = inputString.length();

        if (length <= 1) {
            return inputString;
        }

        leftPart = inputString.substring(0, length / 2);

        rightPart = inputString.substring(length / 2, length);

        return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart);
    }
}
