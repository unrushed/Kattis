package Kattis;

import java.util.Scanner;
//https://open.kattis.com/problems/skener
public class Maginfy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt(), c = input.nextInt(), zH = input.nextInt(), zW= input.nextInt();
        String[][] a = new String[r][c];
        for (int i = 0; i < r; i++) {
            String t = input.next();
            a[i] = t.split("");
        }

        for (int i = 0; i < r; i++) {
            String line = "";
            for (int i1 = 0; i1 < a[i].length; i1++) {
                int x = 0;
                while(x < zW){
                    line = line + a[i][i1];
                    x++;
                }
            }
            int z = 0;
            while(z < zH){
                System.out.println(line);
                z++;
            }
        }
    }
}
