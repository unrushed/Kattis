package Done;

import java.util.Scanner;

public class EndingChess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt(), y1 = input.nextInt();
        int x2 = input.nextInt(), y2 = input.nextInt();

        if(x1 == x2) System.out.println(1);
        else if(y1 == y2) System.out.println(1);
        else System.out.println(2);
    }
}
