package Done;

import java.util.Scanner;

public class Bandwidth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPerMonth = input.nextInt();
        int numberOfMonths = input.nextInt();
        int sum = 0;

        for (int i = 0; i < numberOfMonths; i++) {
            sum += (totalPerMonth - input.nextInt());
        }
        System.out.println(totalPerMonth + sum);
    }
}
