package Done;

import java.util.Scanner;

public class CIAFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean test = true;
        for (int i = 1; i < 6; i++) {
            String temp = input.nextLine();
            if(temp.contains("FBI")) {
                System.out.print(i + " ");
                test = false;
            }

        }
        if(test) System.out.println("HE GOT AWAY!");
    }
}
