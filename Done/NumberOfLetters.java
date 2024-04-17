package Done;

import java.util.Scanner;

public class NumberOfLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next().replaceAll("[^A-Za-z]", "");
        System.out.println(input.length());
    }
}
