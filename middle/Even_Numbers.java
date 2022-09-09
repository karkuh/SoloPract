package middle;

import java.util.Scanner;

public class Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] num_array = num.split(" ");
        for (int i = 0; i < num_array.length; i++) {
            if (Integer.parseInt(num_array[i]) % 2 == 0) {
                System.out.print(num_array[i] + " ");
            }
        }
    }
}
