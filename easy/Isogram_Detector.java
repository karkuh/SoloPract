package easy;

import java.util.Scanner;

public class Isogram_Detector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        char [] src_array = src.toCharArray();
        boolean res = true;
        for (int i = 0; i < src_array.length; i++) {
            for (int j = i+1; j < src_array.length; j++) {
                if (src_array[i]==src_array[j]){
                    res = false;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
