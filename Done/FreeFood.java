package Done;

import java.util.Scanner;

public class FreeFood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[] array = new boolean[366];
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int temp1 = input.nextInt();
            int temp2 = input.nextInt();

            for (int j = temp1; j <= temp2; j++) {
                array[j] = true;
            }
        }

        int answer = 0;

        for (int i = 0; i < 366; i++) {
            if(array[i]) answer++;
        }
        System.out.println(answer);
    }
}
