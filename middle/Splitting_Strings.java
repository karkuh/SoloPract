package middle;

import java.util.Scanner;

public class Splitting_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        int split = sc.nextInt();
        StringBuilder bf = new StringBuilder();
        char[] src_array = src.toCharArray();

        for (int i = 0; i <src_array.length ; i++) {
            bf.append(src_array[i]);
            if (i == src_array.length-1){
                break;
            }
            if ((i+1) % split == 0){
                bf.append("-");
            }
        }
        System.out.println(bf);

    }
}
