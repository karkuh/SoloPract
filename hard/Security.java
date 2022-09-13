package hard;


//author: @karkuh
//You are in charge of security at a casino, and there is a thief who is trying to steal the casino's money!
// Look over the security diagrams to make sure that you always have a guard between the thief and the money!
// There is one money location, one thief, and any number of guards on each floor of the casino.
//
//        Task:
//        Evaluate a given floor of the casino to determine if there is a guard between the money and the thief, if there is not, you will sound an alarm.
//        Input Format:
//        A string of characters that includes $ (money), T (thief), and G (guard), that represents the layout of the casino floor.
//        Space on the casino floor that is not occupied by either money, the thief, or a guard is represented by the character x.
//        Output Format:
//        A string that says 'ALARM' if the money is in danger or 'quiet' if the money is safe.
//        Sample Input:
//        xxxxxGxx$xxxT
//        Sample Output:
//        ALARM

import java.util.Scanner;

public class Security {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        char [] src_array = src.toCharArray();
        boolean res = false;
        int index_G = 0;
        int index_$ = 0;
        int index_T = 0;


        for (int i = 0; i < src_array.length; i++) {
            if (src_array[i]=='G'){
                index_G = i;
            } else if (src_array[i]=='T') {
                index_T = i;
            }else if (src_array[i]=='$'){
                 index_$ = i;
            }
        }
        if (index_G < index_$ && index_G > index_T || index_G < index_T && index_G > index_$){
            System.out.println("quiet");
        }else {
            System.out.println("ALARM");
        }
    }
}
