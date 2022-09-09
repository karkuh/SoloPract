package middle;

import java.util.Scanner;

public class Pig_Latin {
    public static void main(String[] args) {
        StringBuilder bf = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(string);
        String[] string_array = string.split(" ");
        for (int i = 0; i < string_array.length; i++) {
            char[] init = string_array[i].toCharArray();
            for (int j = 1; j < init.length; j++) {
                bf.append(init[j]);
            }
            bf.append(init[0]);
            bf.append("ay");
            bf.append(" ");

        }
        System.out.println(bf);
    }
}
