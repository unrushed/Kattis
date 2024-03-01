package Kattis;
import java.util.Scanner;
public class FindSecondParameter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int r = input.nextInt(), s = input.nextInt();
        System.out.print((2*s) - r);
    }
}
