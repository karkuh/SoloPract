package middle;

import java.util.Scanner;

public class Missing_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        int num [] = new int[len];
        for (int i = 0; i < len ; i++) {
            num[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = num[0]; i < num[num.length-1] ; i++) {

            if (num[j]==i){
                j++;
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
