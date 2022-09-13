package hard;


//author: @karkuh
//You're interviewing to join a security team. They want to see you build a password evaluator
// for your technical interview to validate the input.
//
//        Task:
//        Write a program that takes in a string as input and evaluates it as a valid password. The password is valid if it has at a minimum 2 numbers, 2 of the following special characters ('!', '@', '#', '$', '%', '&', '*'), and a length of at least 7 characters.
//        If the password passes the check, output 'Strong', else output 'Weak'.
//        Input Format:
//        A string representing the password to evaluate.
//        Output Format:
//        A string that says 'Strong' if the input meets the requirements, or 'Weak', if not.
//        Sample Input:
//        Hello@$World19
//        Sample Output:
//        Strong

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
