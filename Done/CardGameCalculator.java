package Kattis;
import java.util.Scanner;
public class CardGameCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char cardNumber, suit, dominent;
        String strTemp;
        int score = 0, numberOfHands, numberOfCards;

        numberOfHands = input.nextInt();
        dominent = input.next().charAt(0);
        numberOfCards = numberOfHands * 4;

        
        for(int x = 0; x < numberOfCards; x++){
            strTemp = input.next();
            cardNumber = strTemp.charAt(0);
            suit = strTemp.charAt(1);
            if(suit == dominent){
                switch(cardNumber){
                    case 'A':
                        score = score + 11;
                        break;
                    case 'K':
                        score = score + 4;
                        break;
                    case 'Q':
                        score = score + 3;
                        break;
                    case 'J':
                        score = score + 20;
                        break;
                    case 'T':
                        score = score + 10;
                        break;
                    case '9':
                        score = score + 14;
                        break;
                    default:
                        score = score + 0;
                        break;         
                }
            }
            else{
                switch(cardNumber){
                    case 'A':
                        score = score + 11;
                        break;
                    case 'K':
                        score = score + 4;
                        break;
                    case 'Q':
                        score = score + 3;
                        break;
                    case 'J':
                        score = score + 2;
                        break;
                    case 'T':
                        score = score + 10;
                        break;
                    case '9':
                        score = score + 0;
                        break;
                    default:
                        score = score + 0;
                        break;         
                }
            }
        }
        System.out.print(score);
    }   
}
