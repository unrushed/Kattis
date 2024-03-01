package Kattis;
import java.util.Scanner;
public class Pizza {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        System.out.print(x%y);
    }
}
