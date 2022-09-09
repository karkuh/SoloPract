package middle;

import java.util.Scanner;

public class Name_Buddy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String friends = sc.nextLine();
        String me = sc.next();
        String [] friends_array = friends.split(" ");

        int temp = 0;
        for (int i = 0; i < friends_array.length ; i++) {
            if (me.toCharArray()[0] == friends_array[i].toCharArray()[0]){
                System.out.println("Compare notes");
                temp++;
                break;
            }
        }
        if (temp == 0){
            System.out.println("No such luck");
        }
    }
}
