package Kattis;
import java.util.Scanner;
public class BAndKs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        int b = 0;
        int k = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'b') b++;
            else if (word.charAt(i) == 'k') k++;
        }
        if (b>k) System.out.println("boba");
        else if (b<k) System.out.println("kiki");
        else if (b == 0) System.out.println("none");
        else if (b == k) System.out.println("boki");
    }
}