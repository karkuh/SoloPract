package middle;

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
