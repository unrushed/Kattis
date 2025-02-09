package Done;

import java.util.Scanner;

public class Pizza2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diameter = input.nextInt();
        double pizzaArea = Math.pow(diameter/2.0,2) * Math.PI;

        int base1 = input.nextInt();
        int base2 = input.nextInt();

        int height = input.nextInt();

        if(((base1 + base2)/2.0) * height > pizzaArea) System.out.println("Trapizza!");
        else if (((base1 + base2)/2.0) * height < pizzaArea) System.out.println("Mahjong!");
        else System.out.println("Jafn storar!");
    }
}
