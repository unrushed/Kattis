package Done;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfNumbers = Integer.parseInt(input.nextLine());
        String in = input.nextLine();
        int awake = 0;
        int numberOfCoffees = 0;
        for (int i = 0; i < numberOfNumbers; i++) {
            switch (in.charAt(i)){
                case '0':
                    if(numberOfCoffees > 0){
                        awake++;
                        numberOfCoffees--;
                    }
                    break;
                case '1':
                    numberOfCoffees = 2;
                    awake++;
                    break;
            }
        }
        System.out.println(awake);
    }
}
