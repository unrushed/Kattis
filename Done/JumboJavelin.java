package Kattis;
import java.util.Scanner;
public class JumboJavelin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfPieces = input.nextInt(), sum = 0, tempPiece;

        for(int x = 0; x < numberOfPieces; x++){
            tempPiece = input.nextInt();
            sum = sum + tempPiece;
        }
        sum = sum -(numberOfPieces-1);
        System.out.print(sum);
    }
}
