package Done;

import java.util.Arrays;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] output = new int[10];

        for (int i = 0; i < 10; i++) {
            output[i] = (input.nextInt())%42;
        }

        Arrays.sort(output);

        int numberOfDistinct = 1;

        for (int i = 1; i < 10; i++) {
            if(output[i] != output[i - 1]){
                numberOfDistinct++;
            }
        }

        System.out.println(numberOfDistinct);
    }
}
