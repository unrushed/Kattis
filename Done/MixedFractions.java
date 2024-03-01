package Kattis;
import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int numerator = input.nextInt(), denominator = input.nextInt(), wholeNumber, m = 0;
        String strOut = "", strOutTemp = "";
        
        while(numerator != 0 && denominator != 0){
           wholeNumber =  numerator/denominator;
           strOutTemp = wholeNumber + " " + (numerator%denominator) + " / " + denominator;
           m++;
           if(m == 1){
               strOut = strOutTemp;
           }else{
               strOut = strOut +  "\r\n" + strOutTemp;
           }
           numerator = input.nextInt(); 
           denominator = input.nextInt();
        }
        System.out.print(strOut);
    }
}
