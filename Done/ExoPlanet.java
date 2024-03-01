package Kattis;
import java.util.Scanner;
public class ExoPlanet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        for(int x = 0; x < testCases; x++){
            double radius = input.nextDouble(), h1 = input.nextDouble() * 0.001, h2 = input.nextDouble() * 0.001;

            System.out.println( radius * (Math.acos(radius/ (h1 + radius)) + Math.acos(radius/ (h2 + radius))));
        }
        
    }
}
