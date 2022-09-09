package easy;

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
