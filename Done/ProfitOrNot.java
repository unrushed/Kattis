package Done;

import java.util.Scanner;

public class ProfitOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String temp = input.nextLine();
            sum += input.nextInt();
            input.nextLine();
        }
        if(sum == 0) System.out.println("Lagom");
        else if (sum > 0) System.out.println("Usch, vinst");
        else System.out.println("Nekad");
    }
}
