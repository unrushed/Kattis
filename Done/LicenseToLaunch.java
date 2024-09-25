package Done;

import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfNumbers = input.nextInt();
        int smallest = input.nextInt();
        int index = 0;
        for (int i = 1; i < numberOfNumbers; i++) {
            int temp = input.nextInt();

            if(smallest > temp) {
                smallest = temp;
                index = i;
            }
        }
        System.out.println(index);
    }
}