package Kattis;

import java.util.Scanner;
//https://open.kattis.com/problems/headguard
public class HeadGuard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextLine()){
            String in = input.nextLine();
            String out = "";
            int count = 1;
            for (int i = 1; i <= in.length(); i++) {
                while(i != in.length() && in.charAt(i) == in.charAt(i-1)){
                    count++;
                    i++;
                }
                out += count + "" + in.charAt(i - 1);
                count = 1;
            }
            System.out.println(out);
        }
    }
}