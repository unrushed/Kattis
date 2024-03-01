package Kattis;
import java.util.Scanner;
public class SortTwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(), num2 = input.nextInt();

        if (num1 > num2){
            System.out.print(num2 + " " +num1);
        }
        else{
            System.out.print(num1 + " " +  num2);
        }
    }
}
