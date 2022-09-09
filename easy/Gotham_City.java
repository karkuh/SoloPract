package easy;

import java.util.Scanner;

public class Gotham_City {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int criminals = sc.nextInt();
        if (criminals < 5){
            System.out.println("'I got this!");
        }else if (criminals > 10){
            System.out.println("Good Luck out there!");
        }else{
            System.out.println(" Help me Batman ");
        }
    }
}
