package Done;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfMatches = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();

        double hyp = Math.sqrt(Math.pow(w,2) + Math.pow(h,2));

        for (int i = 0; i < numberOfMatches; i++) {
            if(hyp>= input.nextInt()) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
