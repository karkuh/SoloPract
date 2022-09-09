package easy;

import java.util.Scanner;

public class Argentina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pesos = sc.nextInt();
        int dollars = sc.nextInt();
        if (pesos* 0.02 > dollars){
            System.out.println("Dollars");
        }else{
            System.out.println("Pesos");
        }
    }
}
