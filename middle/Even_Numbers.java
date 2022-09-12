package middle;


//author: @karkuh
//Given a list of numbers, you want to take out all of the odd ones and leave just the even ones.
//
//        Task:
//        Evaluate each number in your list to see if it is even or odd. Then, output a new list that only contains the even numbers from your original list.
//        Input Format:
//        A string that includes all of the integer values in your list separated by spaces.
//        Output Format:
//        A string that includes all of the even integer values from your first list separated by spaces.
//        Sample Input:
//        8 10 19 25 5 16 12
//        Sample Output:
//        8 10 16 12

import java.util.Scanner;

public class Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] num_array = num.split(" ");
        for (int i = 0; i < num_array.length; i++) {
            if (Integer.parseInt(num_array[i]) % 2 == 0) {
                System.out.print(num_array[i] + " ");
            }
        }
    }
}
