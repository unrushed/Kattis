package Kattis;

import java.util.Scanner;
//https://open.kattis.com/problems/betting
public class Betting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        System.out.println((double)100/x);
        System.out.println((double) 100/(100 - x));
    }
}
