package hard;

import java.util.Scanner;

public class Its_a_Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] words = new String[4];
          words[0] = sc.nextLine();
        words[1] = sc.nextLine();
        words[2] = sc.nextLine();
        words[3] = sc.nextLine();
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            char[] words_array = words[i].toCharArray();
            int temp = 0;
            for (int j = 0; j <words_array.length/2 ; j++) {
                if (words_array[j]== words_array[words_array.length-1-j]){
                    temp ++;
                }
            }

            if (temp== words_array.length/2){
                res++;
            }


        }
        if (res>0){
            System.out.println("Open");
        }else {
            System.out.println("Trash");
        }
    }
}
