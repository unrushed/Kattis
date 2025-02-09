package Done;

import java.util.Scanner;

public class CheapestFlights {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int smallest = 100000;
        int largest = -1;
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            if(smallest> temp) smallest = temp;
            if(temp > largest) largest = temp;
        }

        if(smallest - (largest/2) <= 0) System.out.println("0");
        else System.out.println(smallest - (largest/2));
    }
}
