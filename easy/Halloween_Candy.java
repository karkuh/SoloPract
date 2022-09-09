package easy;

import java.util.Scanner;

public class Halloween_Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float visited_houses = sc.nextFloat();
        float a = 2 / visited_houses;
        float procent = a * 100;
        System.out.println((int) Math.ceil(procent));
    }
}
