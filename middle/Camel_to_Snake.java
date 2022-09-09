package middle;

import java.util.Scanner;

public class Camel_to_Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        char [] src_array = src.toCharArray();
        StringBuilder bf = new StringBuilder();
        for (int i = 0; i < src_array.length; i++) {
            if (String.valueOf(src_array[i]).equals(String.valueOf(src_array[i]).toUpperCase()) && i != 0){
                bf.append("_");
            }
            bf.append(String.valueOf(src_array[i]).toLowerCase());
        }
        System.out.println(bf);
    }
}
