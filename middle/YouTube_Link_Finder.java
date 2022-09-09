package middle;

import java.util.Scanner;

public class YouTube_Link_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String link = sc.nextLine();
        char[] link_array = link.toCharArray();
        for (int i = link_array.length-11; i < link_array.length; i++) {
            System.out.print(link_array[i]);
        }
    }
}
