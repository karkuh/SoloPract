package hard;

import java.util.Scanner;

public class Password_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int numbers = 0;
        int len = 0;
        int symbols = 0;

        len = password.length();
        numbers = password.replaceAll("[^0-9]", "").length();
        symbols = password.replaceAll("[^!@#$%&*]", "").length();

        if (len >= 7 && numbers >= 2 && symbols >= 2) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }


    }
}
