package Done;

import java.util.Arrays;
import java.util.Scanner;

public class ACappella {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfNotes = input.nextInt();
        int difference = input.nextInt();

        int[] arr = new int[numberOfNotes];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        int numberOfRec = 1;

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(!(arr[i] <= min + difference)){
                numberOfRec++;
                min = arr[i];
            }
        }
        System.out.println(numberOfRec);
    }
}
