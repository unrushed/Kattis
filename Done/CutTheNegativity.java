package Kattis;
import java.util.Scanner;

public class CutTheNegativity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[][] inputs = new int[number][number];
        int count = 0;
        for (int i = 0; i < number; i++) {
            for (int i1 = 0; i1 < number; i1++) {
                inputs[i][i1] = input.nextInt();
                if(inputs[i][i1] > 0) count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < number; i++) {
            for (int i1 = 0; i1 < number; i1++) {
                if(inputs[i][i1] > 0){
                    System.out.print((i+1) + " " + (i1 + 1) + " " + inputs[i][i1]);
                    System.out.println();
                }
            }
        }
    }
}