package middle;

import java.util.Scanner;

public class CMYK_to_RGB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float m = sc.nextFloat();
        float y = sc.nextFloat();
        float k = sc.nextFloat();

        int r = Math.round(255 * (1-c) * (1-k));
        int g = Math.round(255 * (1-m) * (1-k));
        int b = Math.round(255 * (1-y) * (1-k));
        System.out.println(r + "," + g + "," + b);

    }
}
