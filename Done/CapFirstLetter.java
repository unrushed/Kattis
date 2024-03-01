package Kattis;
import java.util.Scanner;
public class CapFirstLetter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfWords = input.nextInt();
        String answer = "";

        for(int x = 0; x < numberOfWords; x++){
            String temp = input.next();

            if(temp.charAt(0) - 65 >= 0 && temp.charAt(0) - 65 < 26){
                answer += temp.charAt(0);
            }
        }
        System.out.print(answer);
    }
}