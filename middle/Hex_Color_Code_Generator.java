package middle;


//author: @karkuh
//You are starting a new company and unfortunately that means you can no longer rely on the free hex-color
// code software you used to rely on. It’s time to put your skills to the test and create one from the ground up!
//
//        Task:
//        Create a function that accepts three integers that represent the RGB (red, green, blue) values and outputs the hex-code representation.
//        Input Format:
//        Three integers that represent RGB values.
//        Output Format:
//        The hexadecimal color code string that corresponds with the entered RGB values.
//        Sample Input:
//        100
//        200
//        233
//        Sample Output:
//        #64c8e9

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
