package Done;

import java.util.Scanner;

public class ASCIIKassi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();



        middleOut(number);
        int u = number;
        for (int i = 0; i < number; i ++) {
            diagonal(u , i);
            u--;
        }
        middleIn(number);
        int g = number;
        for (int i = 0; i < number; i++) {
            diagonalDown(g , i);
            g--;
        }

        middleOut(number);
    }

    public static void middleOut(int n){
        String temp = " ";
        for (int i = 0; i < n; i++) {
            temp += " ";
        }
        temp += "x";
        System.out.println(temp);
    }


    public static void diagonal(int n, int p){
        String temp = " ";
        for (int i = 0; i < n - 1; i++) {
            temp += " ";
        }
        temp += "/";
        for (int i = 0; i < p + p + 1; i++) {
            temp += " ";
        }
        System.out.println(temp + "\\");
    }

    public static void middleIn(int n){
        String temp = "x";

        for (int i = 0; i < (n*2) + 1; i++) {
            temp += " ";
        }

        System.out.println(temp + "x");
    }

    public static void diagonalDown(int n, int p){
        String temp = " ";
        for (int i = 0; i < p; i++) {
            temp += " ";
        }
        temp += "\\";

        for (int i = 0; i < n + n - 1; i++) {
            temp += " ";
        }
        System.out.println(temp + "/");
    }
}
