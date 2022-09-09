package hard;

import java.util.Scanner;

public class twoD_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] map = new char[5][5];

        boolean start = false;
        boolean finaly = false;
        int index_i_start = 0;
        int index_j_start = 0;
        int index_i_finaly = 0;
        int index_j_finaly = 0;

        String src = sc.nextLine();
        String [] src_arr = src.split(",");


        for (int i = 0; i < 5; i++) {
            char [] src_array = src_arr[i].toCharArray();
            for (int j = 0; j <5 ; j++) {
                map[i][j] = src_array[j];
                if (!start){
                    index_i_start = i;
                    index_j_start = j;
                    if (map[i][j] == 'P'){
                        start = true;
                    }

                }else if (!finaly){
                    index_i_finaly = i;
                    index_j_finaly = j;
                    if (map[i][j] == 'P'){
                        finaly = true;
                    }
                }
            }

        }



        System.out.println(Math.abs(index_i_finaly - index_i_start) + Math.abs(index_j_finaly - index_j_start));
    }
}
