package middle;

import java.util.Scanner;

public class Roadrunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int runner = sc.nextInt();
        int coyote = sc.nextInt();
        float time_runner = distance/runner;
        float time_coyote = (distance + 50) / coyote;
        if (time_runner < time_coyote){
            System.out.println("Meep Meep");
        }else{
            System.out.println("Yum");
        }

    }
}
