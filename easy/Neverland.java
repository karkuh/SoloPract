package easy;

import java.util.Scanner;

public class Neverland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int my_age = sc.nextInt();
        int difference = sc.nextInt();

        int one = my_age + difference;
        int two = one - my_age;
        System.out.println("My twin is " + one + " years old and they are " + two +" years older than me");

    }
}
