package easy;

import java.util.Scanner;

public class Easter_Eggs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        int my = sc.nextInt();
        int friend = sc.nextInt();

        if (my + friend == all){
            System.out.println("Candy Time");
        }else{
            System.out.println("Keep Hunting");
        }

    }
}
