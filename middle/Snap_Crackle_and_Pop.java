package middle;

import java.util.Scanner;

public class Snap_Crackle_and_Pop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array_amount = new int[6];
        for (int i = 0; i < array_amount.length ; i++) {
            array_amount[i] = sc.nextInt();
        }

        for (int i = 0; i < array_amount.length ; i++) {
            if (array_amount[i] % 3 ==0){
                System.out.print("Pop ");

            }else if(array_amount[i] % 2 != 0){
                System.out.print("Snap ");
            }else{
                System.out.print("Crackle ");
            }
        }

    }
}
