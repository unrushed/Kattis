package Done;

import java.util.Arrays;
import java.util.Scanner;

public class SyncronizingLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            int number = input.nextInt();

            if(number == 0) break;

            int[] listOne = new int[number];
            int[] listOneSorted;
            int[] listTwo = new int[number];

            for (int i = 0; i < number; i++) {
                listOne[i] = input.nextInt();
            }
            listOneSorted = listOne.clone();
            Arrays.sort(listOneSorted);
            for (int i = 0; i < number; i++) {
                listTwo[i] = input.nextInt();
            }

            int[] answer = new int[number];
            Arrays.sort(listTwo);

            for (int i = 0; i < number; i++) {
                answer[findIndex(listOne, listOneSorted[i])] = listTwo[i];
            }

            for (int i = 0; i < number; i++) {
                System.out.println(answer[i]);
            }
            System.out.println();
        }
    }

    public static int findIndex(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if(list[i] == key) return i;
        }
        return -1;
    }
}
