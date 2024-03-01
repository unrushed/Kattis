package Kattis;

import java.util.Scanner;

public class FourtyFiveMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int minute = input.nextInt();

        if(minute < 45 && hour != 0){
            hour--;
            minute += 60;
        }else if(minute < 45){
            hour = 23;
            minute += 60;
        }
        minute -= 45;
        System.out.print(hour + " " + minute);

    }
}
