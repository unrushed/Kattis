package Done;

import java.util.Scanner;

public class MeatAmount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfMeat = in.nextInt();
        if(numberOfMeat > 1) System.out.println("blandad best");
        else System.out.println(in.next());
    }
}
