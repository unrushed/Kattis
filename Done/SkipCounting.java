package Done;

import java.util.Scanner;

public class SkipCounting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i < 13; i++) {
            System.out.println(num*i);

        }
    }
}
