package Done;

import java.util.Scanner;

public class QuaderlateralAreaCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        double semiperimeter = (double) (a + b + c + d) /2;
        System.out.println(Math.sqrt((semiperimeter-a)*(semiperimeter-b)*(semiperimeter-c)*(semiperimeter-d)));
    }
}
