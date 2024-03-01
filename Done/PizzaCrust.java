package Kattis;
import java.util.Scanner;
public class PizzaCrust {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int r = input.nextInt(), c = input.nextInt();

        System.out.print(100 * (Math.PI * Math.pow((r-c), 2) / (Math.PI * Math.pow(r, 2))));
    }
}
