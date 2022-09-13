package hard;


//author: @karkuh
//You have to get a new driver's license and you show up at the office at the same time as 4 other people.
// The office says that they will see everyone in alphabetical order and it takes 20 minutes for them
// to process each new license. All of the agents are available now, and they can each see one customer at a time.
// How long will it take for you to walk out of the office with your new license?
//
//        Task
//        Given everyone's name that showed up at the same time, determine how long it will take to get your new license.
//        Input Format
//        Your input will be a string of your name, then an integer of the number of available agents, and lastly a string of the other four names separated by spaces.
//        Output Format
//        You will output an integer of the number of minutes that it will take to get your license.
//        Sample Input
//        'Eric'
//        2
//        'Adam Caroline Rebecca Frank'
//        Sample Output
//        40

import java.util.Scanner;


public class New_Drivers_License {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_name = sc.nextLine();
        int personal = sc.nextInt();
        sc.nextLine();
        String names = sc.nextLine();
        String[] names_array = names.split(" ");
        String[] names_arr = new String[names_array.length+1];
        for (int i = 0; i < names_array.length; i++) {
            names_arr[i] = names_array[i];
        }
        names_arr[names_arr.length-1] = my_name;

        sort(names_arr);

        double index_my_name = 0 ;
        for (int i = 0; i < names_arr.length; i++) {
            if (my_name.equals(names_arr[i])){
                index_my_name = i;
                break;
            }
        }
        index_my_name++;
        int res = (int) (Math.ceil(index_my_name/personal) * 20);
        System.out.println(res);


    }

    public static void sort(String[] array)
    {
        String st = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isGreaterThen(array[j], array[i]))
                {
                    st = array[i];
                    array[i] = array[j];
                    array[j] = st;
                }
            }
        }
    }
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
