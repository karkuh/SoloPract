package easy;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int output = sc.nextInt();
        int res = 0;
        for (int i = 0; i < output; i++) {
            if (i%3 ==0 || i%5==0 ){
                res += i;
            }
        }
        System.out.println(res);
    }
}
