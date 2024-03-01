package Kattis;
/*
* Ryan Hayden
* 10/15/23
* CS 121 Lab
* DoAsISay
*
* This program will ask for a positive number less then 100 that is not divisible by 5. If you follow all of the rules it will tell you, but if you don't it will as for another number.
*/

import java.util.Scanner;
public class DoAsISay {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int input, divisibleCheck;
        do{
            System.out.println("Please enter a positive integer below 100 that is not divisible by 5: ");
            input = userInput.nextInt();
            divisibleCheck = input/5;
        }while(input > 100 || 0 > input || divisibleCheck * 5 == input);
        System.out.println("The number you enter is " + input);
    }
}
