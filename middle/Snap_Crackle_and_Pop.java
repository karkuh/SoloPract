package middle;


//author: @karkuh
//You have six bowls of Rice Krispies in front of you, and they make different noises when you pour milk over them
// based on the total number of Rice Krispies in each bowl.
//        If a bowl has a number of Rice Krispies that is divisible by 3, it will make a Pop sound.
//        If it is not divisible by 3 but is odd it will make a Snap sound.
//        If it is not divisible by 3, but it is even, it will make a Crackle sound.
//
//        Task:
//        Based on the quantities in each bowl, output the noise that they make.
//        Input Format:
//        You receive 6 integers and each integer represents the number of Rice Krispies in your bowls.
//        Output Format:
//        You should output a string with the sounds made by each bowl separated by spaces in the order that they were input.
//        Sample Input:
//        18
//        5
//        100
//        25
//        40
//        24
//        Sample Output:
//        Pop Snap Crackle Snap Crackle Pop

import java.util.Scanner;

public class Snap_Crackle_and_Pop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array_amount = new int[6];
        for (int i = 0; i < array_amount.length ; i++) {
            array_amount[i] = sc.nextInt();
        }

        for (int i = 0; i < array_amount.length ; i++) {
            if (array_amount[i] % 3 ==0){
                System.out.print("Pop ");

            }else if(array_amount[i] % 2 != 0){
                System.out.print("Snap ");
            }else{
                System.out.print("Crackle ");
            }
        }

    }
}
