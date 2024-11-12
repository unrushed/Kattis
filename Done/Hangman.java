package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String wordToGuess = input.nextLine();
        ArrayList<Character> list = new ArrayList<>();


        for (int i = 0; i < wordToGuess.length(); i++) {
            if(!list.contains(wordToGuess.charAt(i)))
                list.add(wordToGuess.charAt(i));
        }

        boolean lose = false;
        String guess = input.nextLine();
        int guessCount = 0;
        for (int i = 0; i < guess.length(); i++) {
            if(guessCount == 10) {
                lose = true;
                break;
            }
            if(list.isEmpty()) break;
            else if(list.contains(guess.charAt(i))){
                list.remove((Character) guess.charAt(i));
            }else{
                guessCount++;
            }
        }
        if(lose){
            System.out.println("LOSE");
        }else{
            System.out.println("WIN");
        }
    }
}
