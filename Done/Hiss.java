package Kattis;
import java.util.Scanner;
public class Hiss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        boolean test = true;

        for (int i = 0; i < word.length(); i++) {
            if(i == word.length() - 1) break;
            if(word.charAt(i) == 's' && word.charAt(i + 1) =='s'){
                System.out.println("hiss");
                test = false;
                break;
            }
        }
        if(test) System.out.println("no hiss");
    }
}
