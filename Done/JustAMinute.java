package Kattis;
import java.util.Scanner;
public class JustAMinute {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfTestCases = input.nextInt();
        int denominator = 0;
        int numerator = 0;
        boolean test = true;

        for(int x = 0; x < numberOfTestCases; x++){
            int numberOfMinutes = input.nextInt() * 60;
            int numberOfSeconds = input.nextInt();
           /*  if(numberOfSeconds < numberOfMinutes){
                test = false;
            } */
            denominator += numberOfMinutes;
            numerator += numberOfSeconds;
        }
        if((double)numerator/denominator <= 1){
            System.out.print("measurement error");
        }else{
            System.out.print((double)numerator/denominator);
        }
    }
}
