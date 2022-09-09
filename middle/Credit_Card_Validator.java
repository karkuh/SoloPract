package middle;

import java.util.Scanner;

public class Credit_Card_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        StringBuilder bf = new StringBuilder(src);
        bf = bf.reverse();
        src = bf.toString();
        int res = 0;
        char[] src_array = src.toCharArray();
        int a = 1;
        for (int i = 0; i <src_array.length ; i++) {
           int temp = Character.digit(src_array[i], 10);

           if (a % 2 ==0){
               temp *= 2;
           }

           if (temp >9){
               temp -= 9;
           }

            res += temp;
           a++;
        }
        if (res%10==0 && src.length()==16){

            System.out.println("valid");
        }else {

            System.out.println("not valid");
        }
    }
}
