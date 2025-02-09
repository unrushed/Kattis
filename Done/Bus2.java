package Done;

import java.util.Scanner;

public class Bus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long tracker = 0;
        long numberOfPeopleMax = 0;
        long tempGetOnBus = 0;
        long tempGetOffBus = 0;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
        tempGetOffBus = input.nextLong();
        tracker -= tempGetOffBus;
        tempGetOnBus = input.nextLong();
        tracker += tempGetOnBus;

        if(numberOfPeopleMax < tracker) numberOfPeopleMax = tracker;
        }
        System.out.println(numberOfPeopleMax);
    }
}
