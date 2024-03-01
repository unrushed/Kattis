package Kattis;
import java.util.Scanner;
public class CountTheVowels {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();
        char char1;
        int numberOfVowels = 0;
        for(int characters = 0; characters < str.length(); characters++){
            char1 = str.charAt(characters);
            if(char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u'){
                numberOfVowels = numberOfVowels + 1;
            }
        }
        System.out.print(numberOfVowels);
    }   
}
