package Done;

import java.util.Scanner;

public class Snow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int y = Integer.parseInt(input.next()), x = Integer.parseInt(input.next());
        int[] columns = new int[x];

        for (int i = 0; i < y; i++) {
            String temp = input.next();
            for (int j = 0; j < x; j++) {
                if(temp.charAt(j) == 'S'){
                    columns[j]++;
                }
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if(y - columns[j] > i) System.out.print(".");
                else System.out.print("S");
            }
            System.out.println();
        }
    }
}
