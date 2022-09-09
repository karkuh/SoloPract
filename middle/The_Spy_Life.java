package middle;

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
