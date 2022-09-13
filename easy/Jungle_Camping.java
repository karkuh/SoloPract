package easy;


//author:karkuh
//You are camping alone out in the jungle and you hear some animals in the dark nearby.
// Based on the noise they make, determine which animals they are.
//
//        Task:
//        You are given the noises made by different animals that you can hear in the dark, evaluate each noise to determine which animal it belongs to. Lions say 'Grr', Tigers say 'Rawr', Snakes say 'Ssss', and Birds say 'Chirp'.
//        Input Format:
//        A string that represent the noises that you hear with a space between them.
//        Output Format:
//        A string that includes each animal that you hear with a space after each one. (animals can repeat)
//        Sample Input:
//        Rawr Chirp Ssss
//        Sample Output:
//        Tiger Bird Snake

import java.util.Scanner;

public class Jungle_Camping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String [] src_array = src.split(" ");
        for (int i = 0; i <src_array.length ; i++) {
            if (src_array[i].equals("Grr")){
                System.out.print("Lion ");
            }else if (src_array[i].equals("Rawr")){
                System.out.print("Tiger ");
            }else if (src_array[i].equals("Ssss")){
                System.out.print("Snake ");
            }else if (src_array[i].equals("Chirp")){
                System.out.print("Bird ");
            }
        }
    }
}
