package Done;

import java.util.Arrays;
import java.util.Scanner;

public class FlippingPatties {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[43201];

        int numberOfOrders = input.nextInt();

        for (int i = 0; i < numberOfOrders; i++) {
            int numberOfSeconds = input.nextInt();
            int timeOfService = input.nextInt();

            arr[timeOfService]++;
            arr[timeOfService - numberOfSeconds]++;
            arr[timeOfService - (numberOfSeconds * 2)]++;
        }

        Arrays.sort(arr);

        System.out.println(arr[43200]/2);
    }
}
