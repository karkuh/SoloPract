package middle;

import java.util.Scanner;

public class Duty_Free {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String price = sc.nextLine();
        String  [] price_array = (price.split(" "));
        int temp = 0 ;
        for (int i = 0; i < price_array.length ; i++) {
            if (Float.parseFloat(price_array[i])*1.1 > 20){
                System.out.println("Back to the store");
                temp++;
                break;
            }
        }
        if (temp == 0){
            System.out.println("On to the terminal");
        }

    }
}
