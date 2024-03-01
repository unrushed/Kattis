package Kattis;
import java.util.Scanner;
public class OddEcho {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfWords = input.nextInt(), grab = 0, grabEnd = 0;
        String str = "", temp = " ";
        for(int x = 1; x < numberOfWords + 2; x++){
            String strInputTemp = input.nextLine();

            if(x%2 == 0){
                str = str + strInputTemp + " ";
            }
        }
        System.out.println(str);
    }
}
