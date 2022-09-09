package easy;

import java.util.Scanner;

public class Guard_Flamingos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt() *2;
        int width = sc.nextInt() * 2;
        int res = (length + width) / 2;
        System.out.println(res);
    }
}
