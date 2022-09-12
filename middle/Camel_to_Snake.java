package middle;

//author: @karkuh
//The company you are working for is refactoring its entire codebase.
// It's changing all naming conventions from camel to snake case (camelCasing to snake_casing).
//        Every capital letter is replaced with its lowercase prefixed by an underscore _,
//        except for the first letter, which is lowercased without the underscore, so that SomeName becomes some_name.
//
//        Task:
//        Write a program that takes in a string that has camel casing, and outputs the same string but with snake casing.
//        Input Format:
//        A string with camelCasing.
//        Output Format:
//        The same string but with snake_casing.
//        Sample Input:
//        camelCasing
//        Sample Output:
//        camel_casing

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
