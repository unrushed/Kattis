package Kattis;
import java.util.Scanner;
public class DigitSwap{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        String str, switched;
        str = "" + first;
        char char1 = str.charAt(1);
        char char2 = str.charAt(0);
        switched = char1 + "" + char2;
        System.out.print(switched);
    }
}