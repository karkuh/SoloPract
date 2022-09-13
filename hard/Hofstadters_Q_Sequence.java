package hard;


//author: @karkuh
//Hofstadter's Q-Sequence is a sequence of numbers where every integer above
// zero has a corresponding q-sequence value.
// You can determine the q-sequence value from a formula that tells you how far back in
// the sequence to go and add two values together.
// The first two values of the sequence are Q(1) = 1 and Q(2) = 1, and every number above 2
// can be expressed according to the following formula (where n is your input value):
// Q(n) = Q(n - Q(n - 1)) + Q(n - Q(n -2))
//
//        Task:
//        Given an integer value input, determine and output the corresponding q-sequence value.
//        Input Format:
//        A positive integer value.
//        Output Format:
//        A positive integer value that represents the value in the q-sequence that the input holds.
//        Sample Input:
//        5
//        Sample Output:
//        3

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class Hofstadters_Q_Sequence {


    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();

        int res = Q(start);
        System.out.println(res);


    }

    public static int Q(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");
        } else if (n == 1 || n == 2) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = Q(n - Q(n - 1)) + Q(n - Q(n - 2));
        memo.put(n, result);
        return result;
    }

}
