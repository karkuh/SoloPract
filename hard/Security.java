package hard;

import java.util.Scanner;

public class Security {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        char [] src_array = src.toCharArray();
        boolean res = false;
        int index_G = 0;
        int index_$ = 0;
        int index_T = 0;


        for (int i = 0; i < src_array.length; i++) {
            if (src_array[i]=='G'){
                index_G = i;
            } else if (src_array[i]=='T') {
                index_T = i;
            }else if (src_array[i]=='$'){
                 index_$ = i;
            }
        }
        if (index_G < index_$ && index_G > index_T || index_G < index_T && index_G > index_$){
            System.out.println("quiet");
        }else {
            System.out.println("ALARM");
        }
    }
}
