package hard;

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
