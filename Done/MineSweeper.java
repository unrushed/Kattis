package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int y = input.nextInt();
        int x = input.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < y; i++) {
            String[] arr2 = input.next().split("");
            for (int j = 0; j < x; j++) {
                if (arr2[j].equals("*")) {
                    list.add((i + 1) + " " + (j + 1));
                }
            }
        }
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
