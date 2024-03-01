package Kattis;

import java.util.Scanner;
//https://open.kattis.com/problems/eyeofsauron
public class Eye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String x = input.nextLine();
        int f = 0;
        int l = 0;

        int y = 0;

        while(x.charAt(y) != '('){
            f++;
            y++;
        }
        y++;
        while(y != x.length() - 1){
            l++;
            y++;
        }

        if(f == l) System.out.println("correct");
        else System.out.println("fix");
    }
}
