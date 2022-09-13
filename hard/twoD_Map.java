package hard;


//author: @karkuh
//You're given a representation of a 5x5 2D map, and if you can only move left, right, up, or down,
// determine how many moves you would have to make to get between two points on the map.
//
//        Task:
//        Determine the total number of moves that are needed between two points on a map.  The points that you move between are marked with a P and the spaces in between are marked with X.
//        Input Format:
//        A string that represents the 2D space starting at the top left.  Each level from top to bottom is separated by a comma.
//        Output Format:
//        An integer that represents the total number of moves that you had to make.
//        Sample Input:
//        XPXXX,XXXXX,XXXXX,XXXPX,XXXXX
//        Sample Output:
//        5

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
