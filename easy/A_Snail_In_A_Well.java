package easy;
//дупааааааааааааа
import java.util.Scanner;

public class A_Snail_In_A_Well {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        boolean bool = true;
        int day = 0;
        int current_weight = 0;
        while (bool) {
            current_weight += 7;
            day++;
            if (current_weight >= weight) {
                // bool = false;
                break;
            }
            current_weight -= 2;


        }

        System.out.println(day);
    }
}
