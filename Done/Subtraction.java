package Kattis;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            long x = input.nextLong();
            long y = input.nextLong();

            if(x > y){
                System.out.println(x-y);
            }else{
                System.out.println(y-x);
            }
        }
    }
}
