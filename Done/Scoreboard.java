package Kattis;
import java.util.Scanner;
public class Scoreboard {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int top = 0, sumTop = 0, sum = 0, operand, x;
        for(int z = 1; z < 6; z++){
            for(x = 1; x < 5; x++){
                operand = input.nextInt();
                sum = sum + operand;
            }
            if(sum > sumTop){
                top = z;
                sumTop = sum;
            }
            sum = 0;
        }
        System.out.print(top + " " + sumTop);
    }
}
