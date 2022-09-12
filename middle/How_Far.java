package middle;

//author: @karkuh
//You are walking from your house to a pond that is down your street.
//        How many blocks over will you have to walk until you get to the pond?
//
//        Task:
//        Evaluate how many blocks you will have to walk if you are given a representation of your street where H represents your house, P represents the pond, and every B represents a block in between the two.
//        Input Format:
//        A string of letters representing your house, the pond, and blocks on your street.
//        Output Format:
//        An integer value that represents the number of blocks between your house and the pond.
//        Sample Input:
//        BBHBBBBPBBB
//        Sample Output:
//        4

import java.util.Scanner;

public class How_Far {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        char [] src_array = src.toCharArray();
        int start = 0;
        for (int i = 0; i < src_array.length; i++) {
            if (src_array[i] == 'H' || src_array[i] == 'P'){
                start = i;
                break;
            }
        }

        int res = 0;
        for (int i = start+1; i < src_array.length ; i++) {

            if(src_array[i] == 'H' || src_array[i] == 'P'){
                break;
            }
            res++;
        }

        System.out.println(res);
    }
}
