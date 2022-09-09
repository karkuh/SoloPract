package middle;

import java.util.Scanner;

public class Safety_Deposit_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String subjects = sc.next();
        String wanted_item = sc.next();
        String[] elem = subjects.split(",");
        int res = 0;
        for (int i = 0; i < elem.length; i++) {
            res += 5;
            if (elem[i].equals(wanted_item)) {
                break;
            }
        }
        System.out.println(res);
    }
}
