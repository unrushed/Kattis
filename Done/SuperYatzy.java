package Done;

import java.util.Scanner;

public class SuperYatzy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[6];
        int m = input.nextInt();

        for (int i = 0; i < 6; i++) {
            arr[i] = n;
        }

        for (int i = 0; i < n; i++) {
            arr[input.nextInt() - 1]--;
        }
        boolean nope = true;
        for (int i = 0; i < 6; i++) {
            if(arr[i] <= m) {
                nope = false;
                break;
            }
        }
        if(nope) System.out.println("Nej");
        else System.out.println("Ja");
    }
}
