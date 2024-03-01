package Kattis;
import java.util.Scanner;
public class MinimalDistanceWalk{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfTestCases = input.nextInt();
        int max, smallest;

        int[] answers = new int[numberOfTestCases];

        for(int x = 0; x < numberOfTestCases; x++){
            int storeLocations = input.nextInt();
            int[] listOfNumbers = new int[storeLocations];
            for(int y = 0; y < storeLocations; y++){
                listOfNumbers[y] = input.nextInt();
            }

            max = largest(listOfNumbers);
            smallest = smallest(listOfNumbers);

            System.out.println(2 * (max - smallest));
        }
    }


    public static int largest(int[] listOfNumbers){
        int max = listOfNumbers[0];
        for(int p = 0; p < listOfNumbers.length; p++){
            if(listOfNumbers[p] > max){
                max = listOfNumbers[p];
            }
        }
        return max;
    }

    public static int smallest(int[] listOfNumbers){
        int smallest = listOfNumbers[0];
        for(int p = 0; p < listOfNumbers.length; p++){
            if(listOfNumbers[p] < smallest){
                smallest = listOfNumbers[p];
            }
        }
        return smallest;
    }
}