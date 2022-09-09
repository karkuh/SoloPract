package easy;

import java.util.Scanner;

public class Zip_Code_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        int space = src.replaceAll("[^ ]","").length();
        int len = src.length();
        int numbers = src.replaceAll("[^0-9]","").length();

        if (len ==5 && space == 0 && numbers == 5){
            System.out.println("true");
        }else {
            System.out.println("false");
        }




    }
}
