package Kattis;
import java.util.Scanner;
public class CookingWater2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfTests = input.nextInt();

        int[] start = new int[numberOfTests];
        int[] end = new int[numberOfTests];
        int testCase, k = 0;
        
        int[] test = new int[1001];
        boolean Check = false;

        for(int x = 0; x < numberOfTests; x++){
            start[x] = input.nextInt();
            end[x] = input.nextInt();
        }
        

        for(int p = 0; p < numberOfTests; p++){// for the array number
            testCase = start[p];
            for(int u = start[k]; u < end[k] + 1; u++){ //for 
                if(testCase == u){
                    test[u] = test[u] + 1;
                }
                testCase++;
            }
            k++;
        }

        for(int y = 0; y < 1001; y++){
            if(test[y] == numberOfTests){
                System.out.print("gunilla has a point");
                Check = true;
                break;
            }
        }

        if(Check == false){
            System.out.print("edward is right");
        }
    }
}
