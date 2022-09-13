package easy;


//author:karkuh
//You go hunting for Easter eggs with a friend. You think that you have found all of the eggs, but you want to make
// sure that you don't leave any behind! Compare Easter baskets with your friend to decide if you should keep hunting.
//
//        Task:
//        If you know the total number of eggs that were hidden and the amount in both of your baskets. Evaluate whether it is time to eat candy or keep hunting for more eggs.
//        Input Format:
//        Three integer values. The first represents the total number of eggs, the second, the amount in your basket, and lastly the amount that your friend has found.
//        Output Format:
//        A string that says 'Keep Hunting' if there are still eggs out there or 'Candy Time' if you found all the eggs.
//        Sample Input:
//        100
//        40
//        60
//        Sample Output:
//        Candy Time

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
