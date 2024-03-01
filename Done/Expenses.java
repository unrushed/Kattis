package Kattis;
import java.util.Scanner;
public class Expenses {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int expensesAndPayCheck = input.nextInt();
        int sum = 0;

        for(int x = 0; x < expensesAndPayCheck; x++){
            int temp = input.nextInt();

            if(temp < 0){
                sum = sum + temp;
            }
        }
        System.out.print(Math.abs(sum));
    }
}
