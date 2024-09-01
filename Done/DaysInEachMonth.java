package Done;

import java.util.Scanner;

public class DaysInEachMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        switch (number){
            case 12:
            case 10:
            case 8:
            case 7:
            case 5:
            case 3:
            case 1:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println(30);
        }
    }
}
