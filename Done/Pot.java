package Kattis;
import java.util.Scanner;
public class Pot{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfNumbers = input.nextInt(), inputNumber;
        double sum = 0;
        int temp;
        String tempStr; 
        for(int y = 0; y < numberOfNumbers; y++){
            inputNumber = input.nextInt();
            tempStr = inputNumber + "";
            temp = Integer.parseInt(tempStr.charAt(tempStr.length() - 1) + "");
            inputNumber = Integer.parseInt(tempStr.substring(0, tempStr.length() - 1));
            sum = sum + (Math.pow(inputNumber, temp));
        }
        System.out.println(Math.round(sum));
    }
}