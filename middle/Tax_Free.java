package middle;

import java.util.Scanner;

public class Tax_Free {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String [] src_array = src.split(",");
        double res = 0;
        for (int i = 0; i < src_array.length; i++) {
            if (Double.parseDouble(src_array[i]) >= 20){
                res += Double.parseDouble(src_array[i]);
            }else{
                res += Double.parseDouble(src_array[i]) + (Double.parseDouble(src_array[i])*0.07);
            }

        }
        System.out.format("%.2f", res);
    }
}
