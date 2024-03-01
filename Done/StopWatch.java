package Kattis;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStopAndStart = input.nextInt();
        int arr[] = new int[numberOfStopAndStart];
        int sum = 0;

        for (int i = 0; i < numberOfStopAndStart; i++) {
            arr[i] = input.nextInt();
        }
        if(numberOfStopAndStart%2 != 0){
            System.out.println("still running");
        }else{
            for (int z = 1; z < numberOfStopAndStart; z += 2) {
                sum += (arr[z] - arr[z-1]);
            }
            System.out.println(sum);
        }
    }
}