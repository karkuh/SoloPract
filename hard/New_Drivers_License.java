package hard;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

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
