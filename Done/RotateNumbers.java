package Kattis;
import java.util.Scanner;
public class RotateNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String stringAnswer = input.next();
        String result = "";
        int y;
        char tempChar;
        result = stringAnswer;
        y = result.length();
        for(int x = 1; x < result.length(); x++){

            tempChar = stringAnswer.charAt(0);
            stringAnswer = stringAnswer.substring(1, y) + tempChar + stringAnswer.substring(y);
            y--;
        }
        System.out.println(stringAnswer);
    }
}
