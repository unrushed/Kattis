package Done;

import java.util.Scanner;

public class ASCIIAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();

        int sum = 0;

        for (int i = 0; i < in.length(); i++) {
            sum += (in.charAt(i));
        }
        char a = (char) (sum/in.length());
        System.out.println(a);
    }
}
