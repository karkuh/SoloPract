package middle;

import java.util.Scanner;

public class Flowing_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String[] src_array = src.split(" ");
        int res = 0;
        for (int i = 0; i < src_array.length-1; i++) {

            if (src_array[i].charAt(src_array[i].length()-1) == src_array[i+1].charAt(0)){
                res++;
            }
        }
        if (res == src_array.length-1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
