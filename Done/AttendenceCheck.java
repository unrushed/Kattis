package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendenceCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int[] dayOne = new int[x];
        int[] dayTwo = new int[y];

        for (int i = 0; i < x; i++) {
            dayOne[i] = input.nextInt();
        }

        for (int i = 0; i < y; i++) {
            dayTwo[i] = input.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < dayOne.length; i++) {
            for (int j = 0; j < dayTwo.length; j++) {
                if (dayOne[i] == dayTwo[j]) {
                    list.add(dayOne[i]);
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
