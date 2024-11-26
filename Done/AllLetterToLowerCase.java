package Done;

import java.util.Scanner;

public class AllLetterToLowerCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

input.nextLine();

        for (int i = 0; i < n; i++) {
            String in = input.nextLine().toLowerCase();
            String out = (in.charAt(0) + "").toUpperCase();
            out += (in.substring(1));
            System.out.println(out);
        }
    }
}
