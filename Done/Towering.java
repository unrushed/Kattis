package Kattis;
import java.util.Scanner;
import java.util.Arrays;
public class Towering {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] heightsOfFirstBox = new int[3];
        int[] heightsOfSecondBox = new int[3];
        int[] heightsOfBoxes = new int[8];
        boolean br = false;

        for(int x = 0; x < 8; x++){
            heightsOfBoxes[x] = input.nextInt();
        }
        
        for(int i = 5; i > 1; i--){
            for(int j = i - 1; j > 0 ; j--){
                for(int k = j - 1; k > -1; k--){
                    if(heightsOfBoxes[i] + heightsOfBoxes[j] + heightsOfBoxes[k] == heightsOfBoxes[6]){
                        heightsOfFirstBox[0] = heightsOfBoxes[i];
                        heightsOfFirstBox[1] = heightsOfBoxes[j];
                        heightsOfFirstBox[2] = heightsOfBoxes[k];
                        br = true;
                        break;
                    }
                }
                if(br) break;
            }
            if(br) break;
        }
        int z = 0;
        for(int y = 0; y < 6; y++){
            if(heightsOfBoxes[y] != heightsOfFirstBox[0] && heightsOfBoxes[y] != heightsOfFirstBox[1] && heightsOfBoxes[y] != heightsOfFirstBox[2]){
                heightsOfSecondBox[z] = heightsOfBoxes[y];
                z++;
            }
        }
        correctOrder(heightsOfFirstBox);
        correctOrder(heightsOfSecondBox);

        print(heightsOfFirstBox);
        print(heightsOfSecondBox);

        
        
    }
    public static void print(int[] a){
        for(int k = 0; k < 3; k++){
            System.out.print(a[k] + " ");
        }
    }

    public static int[] correctOrder(int[] a){
        int temp;
        if(a[0] < a[1]){
            temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }
        if (a[1] < a[2]){
            temp = a[1];
            a[1] = a[2];
            a[2] = temp;
        }
        if (a[0] < a[1]){
            temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }
        return a;
    }
}