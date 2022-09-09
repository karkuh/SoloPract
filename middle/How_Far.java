package middle;

import java.util.Scanner;

public class How_Far {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        char [] src_array = src.toCharArray();
        int start = 0;
        for (int i = 0; i < src_array.length; i++) {
            if (src_array[i] == 'H' || src_array[i] == 'P'){
                start = i;
                break;
            }
        }

        int res = 0;
        for (int i = start+1; i < src_array.length ; i++) {

            if(src_array[i] == 'H' || src_array[i] == 'P'){
                break;
            }
            res++;
        }

        System.out.println(res);
    }
}
