package Done;

import java.util.Scanner;

public class Chanukah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDays = input.nextInt();

        for (int i = 0; i < numberOfDays; i++) {
            int test = input.nextInt();
            int numberOfDaysTemp = input.nextInt();
            System.out.println(test + " " + numberReturn(numberOfDaysTemp));
        }
    }
    public static int numberReturn(int number){
        int sum = 0;
        for (int i = 1; i < number + 1; i++) {
            sum += (i + 1);
        }
        return sum;
    }
}
