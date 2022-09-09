package middle;

import java.util.Scanner;

public class Thats_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] num =  new int[len];
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i]%2 == 0){
                res += num[i];

            }
        }
        System.out.println(res);
    }
}
