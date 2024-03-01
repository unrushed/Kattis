package Kattis;
import java.util.Arrays;
import java.util.Scanner;
public class Ants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfCases = input.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            int distance = input.nextInt();
            int numberOfAnts = input.nextInt();
            int[] arr = new int[numberOfAnts];
            int min = 0;
            for (int z = 0; z < numberOfAnts; z++) {
                arr[z] = input.nextInt();
                min = Math.min(arr[i], distance - arr[i]);
            }
            if(numberOfAnts == 1){
                System.out.println((distance - arr[0]) + " " + (distance - arr[0]));
            }else{
                Arrays.sort(arr);
                System.out.println(min + " " + (distance - arr[0]));
            }
        }
    }
}