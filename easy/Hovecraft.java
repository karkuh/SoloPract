package easy;

import java.util.Scanner;

public class Hovecraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all = (2000000 * 10) + 1000000;

        int buyer = sc.nextInt();
        int cost = buyer * 3000000;
        if (cost > all) {
            System.out.println("Profit");
        } else if (cost == all) {
            System.out.println("Broke even");
        } else {
            System.out.println("Loss");
        }

    }
}
