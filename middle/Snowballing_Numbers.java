package middle;

import java.util.Scanner;

public class Snowballing_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < len ; i++) {
         arr[i] = sc.nextInt();
         if (i>0){
             if (arr[i]<sum){
                 System.out.println("false");
                 temp++;
                 break;
             }
         }
         sum += arr[i];
        }
        if (temp==0){
            System.out.println("true");
        }
    }
}
