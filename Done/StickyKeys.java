package Kattis;

import java.util.Scanner;

public class StickyKeys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String out = "";
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == (a.charAt(i + 1))) {
            } else {
                out = out + a.charAt(i);
            }
        }
        out += a.charAt(a.length() - 1);
        System.out.println(out);
    }
}
