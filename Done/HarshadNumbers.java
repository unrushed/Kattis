package Kattis;
import java.util.Scanner;
public class  HarshadNumbers {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberInputted = input.nextInt(), sum = 0, y=0, integer = 0;
        String str =  "";
        while(y != 1){
            str = numberInputted + "";
            for(int x = 0; x < str.length(); x++){
                sum = sum + Integer.parseInt(str.charAt(x) + "");
            }
            if (numberInputted%sum == 0){
                System.out.println(numberInputted);
                break;
            }else{
                numberInputted++;
                sum = 0;
            }
        }
   } 
}
