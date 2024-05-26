package Done;

import java.util.Arrays;
import java.util.Scanner;

public class PokerHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[14];
        for (int i = 0; i < 5; i++) {
            String temp = input.next();

            switch (temp.charAt(0)){
                case 'A':
                    number[1]++;
                    break;
                case '2':
                    number[2]++;
                    break;
                case '3':
                    number[3]++;
                    break;
                case '4':
                    number[4]++;
                    break;
                case '5':
                    number[5]++;
                    break;
                case '6':
                    number[6]++;
                    break;
                case '7':
                    number[7]++;
                    break;
                case '8':
                    number[8]++;
                    break;
                case '9':
                    number[9]++;
                    break;
                case 'T':
                    number[10]++;
                    break;
                case 'J':
                    number[11]++;
                    break;
                case 'Q':
                    number[12]++;
                    break;
                case 'K':
                    number[13]++;
                    break;
            }
        }
        Arrays.sort(number);
        System.out.println(number[13]);
    }
}
