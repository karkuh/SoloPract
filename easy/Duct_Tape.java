package easy;


//author:karkuh
//You want to completely cover a flat door on both sides with duct tape.
// You need to know how many rolls of duct tape to buy when you go to the store.
//
//        Task:
//        Given the height and width of the door, determine how many rolls of duct tape you will need (a roll of duct tape is 60 feet long and 2 inches wide and there are 12 inches in each foot). Don't forget both sides of the door!
//        Input Format:
//        Two integers that represent the height and width of the door.
//        Output Format:
//        An integer that represents the total rolls of duct tape that you need to buy.
//        Sample Input:
//        7
//        4
//        Sample Output:
//        6

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
