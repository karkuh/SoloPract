package middle;

//author: @karkuh
//You need to decompress text. The compressed version has a number next to each symbol/letter,
// representing the amount of time that symbol should appear.
//        For example, a2b3 is the compressed version of aabbb
//
//        Task:
//        Write a program that takes the compressed text as input and outputs the decompressed version.
//        Input Format:
//        A single string with letters/symbols, each followed by a number.
//        Output Format:
//        A string, representing the decompressed text.
//        Sample Input:
//        k2&4b1
//        Sample Output:
//        kk&&&&b

import java.util.Scanner;

public class Text_Decompressor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        char[] src_array = src.toCharArray();
        StringBuilder bf = new StringBuilder();
        for (int i = 0; i < src.length(); i+=2) {
            int len =Integer.parseInt(String.valueOf(src_array[i+1]));
            for (int j = 0; j < len ; j++) {
                bf.append(src_array[i]);
            }
        }
        System.out.println(bf);
    }
}
