package easy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Kaleidoscopes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        double res = amount * 5.0;

        if (amount > 1) {
            res -= (res * 0.1);
        }
        res += (res * 0.07);

        System.out.format("%.2f", res);
    }
}

