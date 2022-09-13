package easy;


//author:karkuh
//        Task:
//        Count the number of ones in the binary representation of a given integer.
//        Input Format:
//        An integer.
//        Output Format:
//        An integer representing the count of ones in the binary representation of the input.
//        Sample Input:
//        9
//        Sample Output:
//        2

import java.util.Scanner;

public class Number_of_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String convert = Integer.toBinaryString(number);
        char [] convert_arrays = convert.toCharArray();
        int res = 0;
        for (int i = 0; i < convert_arrays.length; i++) {
            if (convert_arrays[i] == '1'){
                res++;
            }
        }
        System.out.println(res);

    }
}
