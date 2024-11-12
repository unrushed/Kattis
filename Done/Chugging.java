package Done;

import java.util.Scanner;
public class Chugging{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int numberOfBottles = input.nextInt();
        
        int answerAlice = 0;
        int numberTime = input.nextInt();
        int timeAlice = input.nextInt();
        
        for (int u = 0; u < numberOfBottles; u++){
            answerAlice += (numberTime + (timeAlice * u));
        } 
        
        int answerBob = 0;
        int numberTimeBob = input.nextInt();
        int timeBob = input.nextInt();
        
        for (int u = 0; u < numberOfBottles; u++){
            answerBob += (numberTimeBob + (timeBob * u));
        }
        if(answerBob > answerAlice) System.out.print("Alice");
        else if(answerAlice > answerBob) System.out.print("Bob");
        else System.out.print("=");
    }
}