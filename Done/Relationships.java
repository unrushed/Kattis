package Done;

import java.util.Scanner;

public class Relationships {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println((int)(Math.pow(2, n) - (n + 1)));
    }
}
