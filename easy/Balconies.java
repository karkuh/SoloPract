package easy;

import java.util.Scanner;

public class Balconies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String apartmentA = sc.next();
        String apartmentB = sc.next();
        String[] arrayA = apartmentA.split(",");
        String[] arrayB = apartmentB.split(",");
        if(Integer.valueOf(arrayA[0]) *Integer.valueOf(arrayA[1]) < Integer.valueOf(arrayB[0]) *Integer.valueOf(arrayB[1])){
            System.out.println("Apartment B");
        }else{
            System.out.println("Apartment A");
        }

    }
}
