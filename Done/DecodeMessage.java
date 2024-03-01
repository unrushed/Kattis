package Kattis;
import java.util.Scanner;
public class DecodeMessage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        for(int x = 0; x < str.length(); x++){
            if(str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i' || str.charAt(x) == 'o' || str.charAt(x) == 'u'){
                str = str.substring(0, x + 1) + str.substring(x + 3, str.length());
            }
        }
        System.out.print(str);
    }
}
