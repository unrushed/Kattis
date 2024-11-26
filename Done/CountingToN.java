package Done;

import java.util.Scanner;

public class CountingToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i < n + 1; i++) {
            System.out.println(i);
        }
    }
}
