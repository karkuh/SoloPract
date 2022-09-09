package easy;

import java.util.Scanner;

public class Paint_costs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        float sum = (40 + (amount * 5));
        sum += sum *0.1;
        System.out.println((int)Math.ceil(sum));
    }
}
