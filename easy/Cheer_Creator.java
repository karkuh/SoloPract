package easy;

import java.util.Scanner;

public class Cheer_Creator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        StringBuilder bf = new StringBuilder();

        if (value < 1) {
            bf.append("shh");
        } else if (value > 10) {
            bf.append("High Five");
        } else {
            for (int i = 0; i < value; i++) {
                bf.append("Ra!");
            }
        }
        String res = new String(bf);
        System.out.println(res);
    }
}
