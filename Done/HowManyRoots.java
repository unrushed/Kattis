package Done;

import java.util.Scanner;

public class HowManyRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if((b * b) - (4 * a * c) < 0) System.out.println("0");
        else if ((b * b) - (4 * a * c) == 0) System.out.println("1");
        else System.out.println("2");
    }
}
