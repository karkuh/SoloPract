package middle;

import java.util.Scanner;

public class Super_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = sc.next();
        String [] menu_array = (menu.split(","));
        float[] num_array = new float[menu_array.length];
        float max = Float.parseFloat(menu_array[0]);
        float sum = 0 ;
        for (int i = 0; i < num_array.length; i++) {
            num_array[i] = Float.parseFloat(menu_array[i]);
            sum += num_array[i];
            if ( num_array[i] > max){
                max = num_array[i];
            }
        }

        sum -= max;
        sum += sum*0.07;
        int res = (int) (sum*0.3);

        System.out.println(res);




    }
}
