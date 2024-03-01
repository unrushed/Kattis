package Kattis;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfInputs = input.nextInt();
        int sum = 0;
        for (int i = 0; i < numberOfInputs; i++) {
            sum += input.nextInt();
        }
        System.out.print(sum/numberOfInputs);
    }
}
