package Kattis;
import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if(x < y && x < z) System.out.print("Monnei");
        if(z < x && z < y) System.out.print("Dolladollabilljoll");
        if(y < x && y < z) System.out.print("Fjee");
    }
}
