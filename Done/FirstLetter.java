package Done;

import java.util.Scanner;

public class FirstLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        System.out.println(word.charAt(0));
    }
}
