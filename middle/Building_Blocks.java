package middle;

//author: @karkuh
//You are dividing up building block toys by color into even amounts for all of the kids in a 15 person kindergarten
// class. You don't want to give anyone more than anyone else, so you might have some leftover blocks of
// each color in the end.  How many total do you have left over?
//
//        Task:
//        If you know how many of each color block you have, add up the leftover blocks to come up with the amount you will have after you have evenly distributed each color to all 15 students.
//        Input Format:
//        4 integers that represent the blue, red, green, and yellow blocks that you are sorting out (in that order).
//        Output Format:
//        An integer of the total remaining blocks after you have distributed an even amount to all 15 students.
//        Sample Input:
//        150
//        20
//        300
//        53
//        Sample Output:
//        13

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
