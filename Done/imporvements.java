package Kattis;
import java.util.Scanner;
public class imporvements {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        long improvements = userInput.nextInt(), eachYearImprovements = userInput.nextInt();
        System.out.print((improvements/eachYearImprovements) + 2022);
    }
}
