package Kattis;

import java.util.Scanner;
public class Repeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String i = input.nextLine();
        int multiplier = input.nextInt();
        String out = "";

        for (int i1 = 0; i1 < multiplier; i1++) {
            out = out + i;
        }
        System.out.println(out);
    }
}
