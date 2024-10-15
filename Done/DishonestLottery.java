package Done;

import java.util.Scanner;

public class DishonestLottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLotteries = input.nextInt();


        int[] arr = new int[51];
        for (int j = 0; j < 10 * numberOfLotteries; j++) {
            for (int i = 0; i < 5; i++) {
                arr[input.nextInt()]++;
            }

        }
        boolean found = false;
        for (int i = 0; i < 51; i++) {
            if(arr[i] > 2 * numberOfLotteries){
                System.out.println(i);
                found = true;
            }
        }
        if(!found) System.out.println("-1");

    }
}
