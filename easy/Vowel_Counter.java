package easy;

import java.util.Scanner;

public class Vowel_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        src = src.toLowerCase();
        char [] src_array = src.toCharArray();

        int res = 0;
        for (int i = 0; i <src_array.length ; i++) {
            if (src_array[i] == 'a' || src_array[i] == 'e' || src_array[i] == 'i' || src_array[i] == 'o' || src_array[i] == 'u'  ){
                res++;
            }
        }
        System.out.println(res);

    }
}
