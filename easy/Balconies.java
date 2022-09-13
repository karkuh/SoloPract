package easy;


//author:karkuh
//You are trying to determine which of two apartments has a larger balcony. Both balconies are rectangles,
// and you have the length and width, but you need the area.
//
//        Task
//        Evaluate the area of two different balconies and determine which one is bigger.
//        Input Format
//        Your inputs are two strings where the measurements for height and width are separated by a comma. The first one represents apartment A, the second represents apartment B.
//        Output Format:
//        A string that says whether apartment A or apartment B has a larger balcony.
//        Sample Input
//        '5,5'
//        '2,10'
//        Sample Output
//        Apartment A

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
