package Done;

import java.util.Scanner;

public class Tiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int outside = input.nextInt();
        int inside = input.nextInt();
        int m = 0;
        int n;

        for (n = 1; n < inside; n++) {
            if(inside%n == 0 && ((inside/n) + 2) * (n + 2) == (outside + inside)){
                break;
            }
        }

        System.out.println(((inside/n) + 2) + " " + (n + 2));
    }
}
