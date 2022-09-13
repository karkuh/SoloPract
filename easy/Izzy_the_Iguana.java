package easy;


//author:karkuh
//Your pet Iguana has run away, and you found it up in a tree! It will come down right away if you brought the right
// snacks, but if you don't have enough, you will have to wait. You need 10 total snack points to bring it down.
// Lettuce is worth 5, Carrot is worth 4, Mango is worth 9, and Cheeseburger is worth 0.
//
//        Task:
//        Evaluate whether or not you have enough snack points to convince your iguana to come down.
//        Input Format:
//        Your input is a string that represents the snacks that you have. Snacks are separated by spaces, you can have any number of snacks, and they can repeat.
//        Output Format:
//        A string that says 'Come on Down!' if you have enough points, or 'Time to wait' if you do not.
//        Sample Input:
//        Mango Cheeseburger Carrot
//        Sample Output:
//        Come on Down!

import java.util.Scanner;

public class Izzy_the_Iguana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] word_array = word.split(" ");
        int res = 0;
        for (int i = 0; i < word_array.length; i++) {
            if (word_array[i].equals("Lettuce")  ){
                res +=5 ;
            }else if (word_array[i].equals("Carrot")){
                res +=4 ;
            }else if (word_array[i].equals("Mango")){
                res +=9 ;
            }else if (word_array[i].equals("Cheeseburger")){
                res +=0 ;
            }
        }

        if (res >=10 ){
            System.out.println("Come on Down!");
        }else{
            System.out.println("Time to wait");
        }
    }
}
