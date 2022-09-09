package easy;

import java.util.Scanner;

public class Duct_Tape {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         float height = sc.nextInt() * 12;
         float width = sc.nextInt() * 12;
         float res = (height * width * 2) / (720*2);
        System.out.println((int)Math.ceil(res));

    }
}
