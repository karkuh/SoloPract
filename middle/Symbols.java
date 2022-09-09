package middle;

import java.util.Scanner;

public class Symbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word.replaceAll("[^A-Za-z0-9 ]", ""));
    }
}
