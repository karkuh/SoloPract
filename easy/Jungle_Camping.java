package easy;

import java.util.Scanner;

public class Jungle_Camping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String [] src_array = src.split(" ");
        for (int i = 0; i <src_array.length ; i++) {
            if (src_array[i].equals("Grr")){
                System.out.print("Lion ");
            }else if (src_array[i].equals("Rawr")){
                System.out.print("Tiger ");
            }else if (src_array[i].equals("Ssss")){
                System.out.print("Snake ");
            }else if (src_array[i].equals("Chirp")){
                System.out.print("Bird ");
            }
        }
    }
}
