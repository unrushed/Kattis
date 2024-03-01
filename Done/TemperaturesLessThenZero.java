package Kattis;
import java.util.Scanner;
public class TemperaturesLessThenZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfTemperatures = input.nextInt(), tempTemperature, y = 0;
        for(int x = 0; x<numberOfTemperatures; x++){
            tempTemperature = input.nextInt();
            if (tempTemperature < 0){
                y++;
            }
        }
        System.out.print(y);
    }   
}
