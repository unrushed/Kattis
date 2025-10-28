package Done;

import java.util.Scanner;

public class DrinkingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfBottles = Integer.parseInt(input.nextLine());
        String beverage = input.nextLine();

        do{
            if(numberOfBottles != 1){
                System.out.println(numberOfBottles + " bottles of " + beverage + " on the wall, " + numberOfBottles + " bottles of " + beverage +".");
                if(numberOfBottles == 2) System.out.println("Take one down, pass it around, 1 bottle of "+ beverage + " on the wall.");
                else System.out.println("Take one down, pass it around, "+ (numberOfBottles - 1) + " bottles of "+beverage+" on the wall.");
            }else {
                System.out.println("1 bottle of "+beverage+ " on the wall, 1 bottle of "+beverage+".");
                System.out.println("Take it down, pass it around, no more bottles of "+ beverage +".");
            }
            System.out.println();
            numberOfBottles--;
        }while (numberOfBottles != 0);
    }
}
