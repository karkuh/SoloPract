package easy;

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
