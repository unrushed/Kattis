package Kattis;
import java.util.Scanner;
public class Hey {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String strInput = input.next(), strOutput = "h";
        int x = 0, y = 1, z = 0, totalETimesTwo;
        while(x<1){
            if(strInput.charAt(y) == 'e'){
              y++;
              z++; 
            }
            else{
                break;
            }
        }
            totalETimesTwo= z * 2;
            for(int i = 0; i < totalETimesTwo; i++){
                strOutput = strOutput + "e";
            }
            strOutput = strOutput + "y";
            System.out.print(strOutput);
    }
}
