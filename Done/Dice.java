package Kattis;

import java.util.Scanner;
//https://open.kattis.com/problems/dicecup
public class Dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = Math.min(x,y);

        while(z < Math.max(x,y) + 1){
            z++;
            System.out.println(z);
        }


    }
}
