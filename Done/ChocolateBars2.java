package Done;

import java.util.Scanner;

public class ChocolateBars2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h = input.nextInt();
        int w = input.nextInt();

        if((h*w)%2 == 0) System.out.println("Alf");
        else System.out.println("Beata");
    }

}
