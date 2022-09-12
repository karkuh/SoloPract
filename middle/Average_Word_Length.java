package middle;

//author: @karkuh
//You are in a college level English class, your professor wants you to write an essay,
// but you need to find out the average length of all the words you use. It is up to you to figure
// out how long each word is and to average it out.
//
//        Task:
//        Takes in a string, figure out the average length of all the words and return a number representing the average length. Remove all punctuation. Round up to the nearest whole number.
//        Input Format:
//        A string containing multiple words.
//        Output Format:
//        A number representing the average length of each word, rounded up to the nearest whole number.
//        Sample Input:
//        this phrase has multiple words
//        Sample Output:
//        6

import java.util.Scanner;

public class Average_Word_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String[] src_word = src.split(" ");
        char[] src_array = src.toCharArray();

        double res = 0;
        for (int i = 0; i < src_array.length; i++) {
            if (src_array[i] =='a'||src_array[i] =='A'||src_array[i] =='b'||src_array[i] =='B'||src_array[i] =='c'||
                    src_array[i] =='C'||src_array[i] =='d'||src_array[i] =='D'||src_array[i] =='e'||src_array[i] =='f'||src_array[i] =='g'||
                    src_array[i] =='h'||src_array[i] =='i'||src_array[i] =='j'||src_array[i] =='k'||src_array[i] =='l'||src_array[i] =='m'||
                    src_array[i] =='n'||src_array[i] =='o'||src_array[i] =='p'||
                    src_array[i] =='q'||src_array[i] =='r'||src_array[i] =='s'||src_array[i] =='t'||src_array[i] =='u'||src_array[i] =='v'||src_array[i] =='w'||src_array[i] =='x'||src_array[i] =='y'||src_array[i] =='z'||
                    src_array[i] =='Q'||src_array[i] =='W'||src_array[i] =='E'||src_array[i] =='R'||src_array[i] =='T'||src_array[i] =='Y'||
                    src_array[i] =='U'||src_array[i] =='I'||src_array[i] =='O'||src_array[i] =='P'||src_array[i] =='S'||src_array[i] =='F'||
                    src_array[i] =='G'||src_array[i] =='H'||src_array[i] =='J'||src_array[i] =='K'||src_array[i] =='L'||src_array[i] =='Z'||
                    src_array[i] =='X'||src_array[i] =='V'||src_array[i] =='N'||src_array[i] =='M'){
                res++;
            }
        }

        System.out.println((int)Math.ceil(res/src_word.length));
    }
}
