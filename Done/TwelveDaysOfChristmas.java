package Done;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            sum1 += i;
            for (int j = 1; j <= i; j++) {
                sum2 += j;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
