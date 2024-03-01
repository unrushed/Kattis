package Kattis;
import java.util.Scanner;
public class Bus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfTests = input.nextInt(), test;
        double y = 0;

        for(int x = 0; x < numberOfTests; x++){
            test = input.nextInt();

            for(int t = 0; t< test; t++){
                y = 2 * (y + 0.5);
            }
            System.out.println(Math.round(y));
            y = 0;
        }
    }
}
