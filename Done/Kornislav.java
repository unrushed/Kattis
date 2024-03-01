package Kattis;
import java.util.Scanner;
public class Kornislav {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int temp, num1 = input.nextInt(),  num2 = input.nextInt(),  num3 = input.nextInt(),  num4 = input.nextInt(), sum;
        if(num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num3 > num4){
            temp = num3;
            num3 = num4;
            num4 = temp;
        }
        if(num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        sum = num1 * num2;
        System.out.print(sum);
    }    
}
