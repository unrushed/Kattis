package Done;

import java.util.Scanner;

public class OrderingFiveNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        while(!rightPlace(arr)){
            if(arr[0] > arr[1]){
                int temp = arr[1];
                arr[1] = arr[0];
                arr[0] = temp;
                printAll(arr);
            }
            if(arr[1] > arr[2]){
                int temp = arr[2];
                arr[2] = arr[1];
                arr[1] = temp;
                printAll(arr);
            }
            if(arr[2] > arr[3]){
                int temp = arr[3];
                arr[3] = arr[2];
                arr[2] = temp;
                printAll(arr);
            }
            if(arr[3] > arr[4]){
                int temp = arr[4];
                arr[4] = arr[3];
                arr[3] = temp;
                printAll(arr);
            }
        }
    }
    public static boolean rightPlace(int[] arr){
        for (int i = 0, k = 1; i < 5; i++, k++) {
            if(arr[i] != k){
                return false;
            }
        }
        return true;
    }
    public static void printAll(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
