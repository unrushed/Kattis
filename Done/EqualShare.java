package Done;

import java.util.Scanner;

public class EqualShare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
        }

        if(sum%3 != 0) System.out.println("no");
        else System.out.println("yes");
    }
}
