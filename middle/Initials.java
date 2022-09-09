package middle;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String []src_array = new String[len];
        for (int i = 0; i < len ; i++) {
            src_array[i] = sc.nextLine();
        }

        for (int i = 0; i <src_array.length ; i++) {
            String[] arr = src_array[i].split(" ");
            System.out.print(arr[0].charAt(0) + "" + arr[1].charAt(0) + " " );

        }
    }
}
