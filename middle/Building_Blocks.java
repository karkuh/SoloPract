package middle;

import java.util.Scanner;

public class Building_Blocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] colors = new int[4];
        int sum  = 0 ;
        for (int i = 0; i < colors.length ; i++) {
            colors [i] = sc.nextInt();
            sum += colors[i] % 15;
        }

        System.out.println(sum);
    }
}
