package Kattis;

import java.util.Scanner;
// https://open.kattis.com/problems/faktor
public class Faktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println((x * y) - (x - 1));
    }
}
