package Kattis;
import java.util.Scanner;
public class SpamDetection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String line = input.next();
        int lowercaseChars = 0;
        int upperCase = 0;
        int underscores = 0;
        int symbolsNotIncludingUnderscores = 0;

        for(int x = 0; x < line.length(); x++){
            int asciiNumber = line.charAt(x);
            if(asciiNumber > 96 && asciiNumber < 123){
                lowercaseChars++;
            }else if(asciiNumber > 64 && asciiNumber < 91){
                upperCase++;
            }else if(asciiNumber == 95){
                underscores++;
            }else{
                symbolsNotIncludingUnderscores++;
            }
        }

        System.out.println((double) underscores/line.length());
        System.out.println((double) lowercaseChars/line.length());
        System.out.println((double) upperCase/line.length());
        System.out.println((double) symbolsNotIncludingUnderscores/line.length());
    }
}
