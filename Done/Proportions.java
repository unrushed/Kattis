package Kattis;
import java.util.Scanner;
public class Proportions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numbersInARow = input.nextInt();
        int numberOfRows = input.nextInt();
        int count = 0;
        for(int x = 0; x < numberOfRows; x++){
            String rowTemp = input.next();

            for(int y = 0; y < numbersInARow; y++){
                if(rowTemp.charAt(y) == '.'){
                    count++;
                }
            }
        }

        System.out.print((double) count/(numberOfRows * numbersInARow));
    }
}