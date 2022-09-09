package middle;

import java.util.Scanner;

public class Carrot_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        int num_boxes = sc.nextInt();
        int temp = all % num_boxes;
        int res = 7 - temp;
        if (res <= 0 ){
            System.out.println("Cake Time");
        }else{
            System.out.println("I need to buy " +res +  " more");
        }
    }
}
