package Kattis;
import java.util.Scanner;
public class AddingTrouble {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt(), secondNumber = input.nextInt(), thirdNumber = input.nextInt(), correctSum;
        correctSum = firstNumber + secondNumber;
        if (thirdNumber == correctSum){
            System.out.println("correct!");
        }
        else{
            System.out.println("wrong!");
        }
    }
}
