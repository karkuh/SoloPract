package middle;


//author: @karkuh
//You are given a list of names for a fundraiser, but you need to keep the names relatively anonymous.
// You are tasked with getting the initials for each name provided.
//
//        Task:
//        Given a list of first and last names, take the first letter from each name to create initials and output them as a space-separated string.
//        Input Format:
//        The first input denotes the number of names in the list (N). The next N lines contain the list elements as strings.
//        Output Format:
//        A string containing the initials of each name in the original list, separated by spaces.
//        Sample Input:
//        3
//        Nick Dunburry
//        Tommy Newborne
//        David James
//        Sample Output:
//        ND TN DJ

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String []src_array = new String[len];
        for (int i = 0; i < len ; i++) {
            src_array[i] = sc.nextLine();
        }

        for (int i = 0; i <src_array.length ; i++) {
            String[] arr = src_array[i].split(" ");
            System.out.print(arr[0].charAt(0) + "" + arr[1].charAt(0) + " " );

        }
    }
}
