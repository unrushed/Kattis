package Kattis;
import java.util.Scanner;
public class Reorder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        int temp;
        String order = input.next();

        //orders the numbers from smallest to largest
        if(num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for(int x = 0; x < 3; x++){
            if(order.charAt(x) == 'A'){
                System.out.print(num1 + " ");
            }else if(order.charAt(x) == 'B'){
                System.out.print(num2 + " ");
            }else if(order.charAt(x) == 'C'){
                System.out.print(num3 + " ");
            } 
        }

    }
}
