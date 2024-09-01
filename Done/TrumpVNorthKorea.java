package Done;

import java.util.Scanner;

public class TrumpVNorthKorea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int trump = input.nextInt();
        int kim = input.nextInt();

        if(trump>kim) System.out.println("MAGA!");
        else if(kim>trump) System.out.println("FAKE NEWS!");
        else System.out.println("WORLD WAR 3!");
    }
}
