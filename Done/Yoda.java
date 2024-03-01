package Kattis;
import java.util.Scanner;
public class Yoda {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String firstNumber = input.next(), secondNumber = input.next();
        

        while(true){
            if(firstNumber.length() == secondNumber.length()) {
                break;
            }else if(firstNumber.length() > secondNumber.length()){
                secondNumber = "0" + secondNumber;
            }else if(firstNumber.length() < secondNumber.length()){
                firstNumber = "0" + firstNumber;
            } 
        }

        String firstOut = "", secondOut = "";

        for(int u = 0; u < firstNumber.length(); u++){
            if(firstNumber.charAt(u) > secondNumber.charAt(u) && u == firstNumber.length() - 1){
                firstOut = firstOut + firstNumber.charAt(u);
                break;
            }else if(firstNumber.charAt(u) < secondNumber.charAt(u) && u == firstNumber.length() - 1){
                secondOut = secondOut + secondNumber.charAt(u);
                break;
            }
            else if(firstNumber.charAt(u) > secondNumber.charAt(u)){
                firstOut = firstOut + firstNumber.charAt(u);
                continue;
            }else if (firstNumber.charAt(u) < secondNumber.charAt(u)){
                secondOut = secondOut + secondNumber.charAt(u);
                continue; 
            }else{
                firstOut = firstOut + firstNumber.charAt(u);
                secondOut = secondOut + secondNumber.charAt(u);
                continue;
            }
        }

        if(firstOut == ""){
            firstOut = "YODA";
        }else if(secondOut == ""){
            secondOut = "YODA";
        }
        if(secondOut != "YODA"){
            if(Integer.parseInt(secondOut) == 0){
                secondOut = "0";
            }
        }
        if(firstOut != "YODA"){
            if(Integer.parseInt(firstOut) == 0){
                firstOut = "0";
            }
        }

        System.out.println(firstOut);
        System.out.println(secondOut);
    }
}
