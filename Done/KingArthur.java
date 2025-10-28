package Done;

import java.util.Scanner;

public class KingArthur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble(), y = input.nextDouble();
        int f = input.nextInt();

        double circumfrence = 3.14159  * x;

        double space = y*f;

        if(space <= circumfrence) System.out.println("YES");
        else System.out.println("NO");
    }
}
