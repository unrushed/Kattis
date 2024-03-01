package Kattis;

import java.util.Scanner;

//https://open.kattis.com/problems/knightpacking
public class KnightPacking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if(x%2 == 0) System.out.println("second");
        else System.out.println("first");
    }
}
