package easy;

import java.util.Scanner;

public class Skee_Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        int price = sc.nextInt();

        if((point/12) >= price){
            System.out.println("Buy it!");
        }else{
            System.out.println("Try again");
        }
    }
}
