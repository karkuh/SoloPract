package middle;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String divider = sc.nextLine();
        String[] dividers = divider.split(" ");
        int temp = 0;

        for (int i = 0; i < dividers.length; i++) {
            if ((num) % Integer.parseInt(dividers[i]) != 0) {
                System.out.println("not divisible by all");
                temp++;
                break;
            }
        }
        if (temp == 0) {
            System.out.println("divisible by all");
        }
    }
}
