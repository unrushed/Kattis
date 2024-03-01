package Kattis;
import java.util.Scanner;
public class Kangaroo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();

        if((c - b) - 1 > (b - a) - 1){
            System.out.print((c-b) - 1);
        }else{
            System.out.print((b-a) - 1);
        }
    }
}
