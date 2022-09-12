package middle;

//author: @karkuh
//You are robbing a bank, but you’re not taking everything.
//You are looking for a specific item in the safety deposit boxes and you are going to drill into each one
// in order to find your item. Once you find your item you can make your escape, but how long will it take
// you to get to that item?
//
//        Task
//        Determine the amount of time it will take you to find the item you are looking for if it takes you 5 minutes to drill into each box.
//        Input Format
//        A string that represent the items in each box that will be drilled in order (items are separated by a comma), and secondly, a string of which item you are looking for.
//        Output Format
//        An integer of the amount of time it will take for you to find your item.
//        Sample Input
//        'gold,diamonds,documents,Declaration of Independence,keys'
//        'Declaration of Independence'
//        Sample Output
//        20

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
