package easy;

import java.util.Scanner;

public class Ballpark_Orders {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choise = sc.nextLine();
        String[] choiseArray = choise.split(" ");
        float sum = 0;
        for (int i = 0; i < choiseArray.length; i++) {
            if (choiseArray[i].equals("Nachos") || choiseArray[i].equals("Pizza")) {
                sum += 6;
            } else if (choiseArray[i].equals("Cheeseburger")) {
                sum += 10;
            } else if (choiseArray[i].equals("Water")) {
                sum += 4;
            } else if (choiseArray[i].equals("Coke")) {
                sum += 5;
            } else {
                sum += 5;
            }


        }

        sum += sum * 0.07;
        System.out.println(sum);
    }
}
