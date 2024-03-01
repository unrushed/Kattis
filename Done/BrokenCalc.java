package Kattis;
import java.util.Scanner;
public class BrokenCalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfOperations = input.nextInt();
        long previousNumber = 1;


        for(int x = 0; x < numberOfOperations; x++){
            long num1 = input.nextLong();
            String operation = input.next();
            long num2 = input.nextLong();

            if(operation.equals("*")){
                previousNumber = (num1 * num2) * (num1 * num2);
                System.out.println(previousNumber);
            }else if(operation.equals("+")){
                previousNumber = ((num1 + num2) - previousNumber);
                System.out.println(previousNumber);
            }else if(operation.equals("-")){
                previousNumber = (num1 - num2) * (previousNumber);
                System.out.println(previousNumber);
            }else if(operation.equals("/")){
                if(num1%2 == 0){
                    previousNumber = num1 / 2;
                }else{
                    previousNumber = (num1 + 1) / 2; 
                }
                System.out.println(previousNumber);
            }
        }
    }
}