package easy;

import java.util.Scanner;

public class Land_Ho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queue = sc.nextInt();
        int res = 0;
        while (true){
            if (queue >= 20){
                res += 20;
            }else{
                res+= 10;
                break;
            }
            queue-= 20;

        }

        System.out.println(res);

    }
}
