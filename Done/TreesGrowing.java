package Kattis;
import java.util.Scanner;
import java.util.Arrays;
public class TreesGrowing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfTrees = input.nextInt();
        int[] arr = new int[numberOfTrees];

        for(int y = 0; y < numberOfTrees; y++){
            arr[y] = input.nextInt();
        }
        Arrays.sort(arr);

        int max = -1;
        int day = 1;
        for(int r = numberOfTrees - 1; r > -1; r--){
            if(arr[r] + day + 1 > max){
                max = arr[r] + day + 1;
            }
            day++;
        }
        System.out.print(max);

    }
}
