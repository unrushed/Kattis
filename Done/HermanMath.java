package Kattis;
import java.util.Scanner;
public class HermanMath {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        //double answer = Math.abs(0 - r)) + Math.abs(0 - 0);

        System.out.println(Math.PI * Math.pow(r,2));
        System.out.println(r * r * 2);

    }
}
