package Kattis;
import java.util.Scanner;
public class CardCounting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int tTotal = 0, cTotal = 0, gTotal = 0, amount = 0;

        for(int x = 0; x < str.length(); x++){
            char charTemp = str.charAt(x);

            if(charTemp == 'T'){
                tTotal++;
            }else if(charTemp == 'G'){
                gTotal++;
            }else if (charTemp == 'C'){
                cTotal++;
            }
        }

        if(tTotal > 0 && cTotal > 0 && gTotal > 0){
            amount = 7 * (Math.min(Math.min(tTotal, gTotal), cTotal));
        }
;
        double total = (Math.pow(gTotal, 2)) + (Math.pow(cTotal, 2)) + (Math.pow(tTotal, 2)) + amount;
        System.out.print(Math.round(total));
    }
}
