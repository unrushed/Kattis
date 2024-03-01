package Kattis;
import java.util.Scanner;
public class TrailorWeight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int GCVWR = input.nextInt(), weightOfTruck = input.nextInt(), amount = input.nextInt(), sumOfWeight = 0, item;

        for(int x = 0; x < amount; x++){
            item = input.nextInt();
            sumOfWeight = sumOfWeight + item;
        }    
        System.out.print(Math.round((GCVWR - weightOfTruck) * 0.9) - sumOfWeight);
    }
}
