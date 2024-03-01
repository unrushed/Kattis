package Kattis;

import java.util.Scanner;
//https://open.kattis.com/problems/smil
public class Smiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String i = input.nextLine();
        for (int i1 = 0; i1 < i.length() - 2; i1++) {
            if(i.charAt(i1) == ':' && i.charAt(i1 + 1) == ')') System.out.println(i1);
            else if(i.charAt(i1) == ':' && i.charAt(i1 + 1) == '-' && i.charAt(i1 + 2) == ')') System.out.println(i1);
            else if(i.charAt(i1) == ';' && i.charAt(i1 + 1) == ')') System.out.println(i1);
            else if(i.charAt(i1) == ';' && i.charAt(i1 + 1) == '-' && i.charAt(i1 + 2) == ')') System.out.println(i1);
        }
        if(i.charAt(i.length() - 2) == ':' && i.charAt(i.length() - 1) == ')'){
            System.out.println(i.length() - 2);
        }
    }
}
