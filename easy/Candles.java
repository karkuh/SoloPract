package easy;

import java.util.Scanner;

public class Candles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int res = 9 + (amount*9);
        System.out.println(res);
    }
}
