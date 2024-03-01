package Kattis;

import java.util.Scanner;
//https://open.kattis.com/problems/easiest
public class TheEasiestProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
        int in = input.nextInt();
        int start = 11;
        if(in == 0) break;
        String o = String.valueOf(in);
        int sum1 = 0;
        for (int i = 0; i < o.length(); i++) {
            sum1 += o.charAt(i) - 48;
        }
        while(true){
            int test = in * start;
            String test2 = String.valueOf(test);
            int sum2 = 0;
            for (int i = 0; i < test2.length(); i++) {
                sum2 += test2.charAt(i) - 48;
            }
            if(sum1 == sum2)
                break;
            else start++;
        }
            System.out.println(start);
        }
    }
}