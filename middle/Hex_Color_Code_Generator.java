package middle;

import java.util.Scanner;

public class Hex_Color_Code_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        System.out.println("#" + Integer.toHexString(one) + Integer.toHexString(two) + Integer.toHexString(three));

    }
}
