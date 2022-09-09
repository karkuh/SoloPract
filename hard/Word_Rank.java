package hard;


import java.util.*;
import java.util.stream.Collectors;

public class Word_Rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();

        Set<String> res = permutationFinder(src);
        List <String> list = convertToList(res);
        Collections.sort(list);
        int result = 1 ;
        for (String temp: list) {
            if (temp.equals(src)){
                System.out.println(result);
                break;
            }
            result++;
        }



    }

    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(insertChar(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String insertChar(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static  List<String> convertToList(Set<String> set) {
        return set.stream().collect(Collectors.toList());
    }

}
