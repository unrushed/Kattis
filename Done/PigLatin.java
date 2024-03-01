package Kattis;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String[] in = input.nextLine().split(" ");
            String out = "";

            for (int i = 0; i < in.length; i++) {
                if(in[i].charAt(0) == 'a' || in[i].charAt(0) == 'e' || in[i].charAt(0) == 'o' || in[i].charAt(0) == 'i' || in[i].charAt(0) == 'u' || in[i].charAt(0) == 'y'){
                    out += in[i].concat("yay ");
                }else{
                    int i2;
                    for (i2 = 0; i2 < in[i].length(); i2++) {
                        if(in[i].charAt(i2) == 'a' || in[i].charAt(i2) == 'e' || in[i].charAt(i2) == 'o' || in[i].charAt(i2) == 'i' || in[i].charAt(i2) == 'u' || in[i].charAt(i2) == 'y'){
                            break;
                        }
                    }
                    out += in[i].substring(i2).concat(in[i].substring(0, i2)) + "ay ";
                }
            }
            System.out.println(out);
        }
    }
}