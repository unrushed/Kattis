package Done;

import java.util.Scanner;

public class AttendenceLeftOrRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int p = input.nextInt();
        String[][] arr = new String[r][p];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < p; j++) {
                arr[i][j] = input.next();
            }
        }

        for (int i = 0; i < r; i++) {
            String firstTemp = input.next();

            if(firstTemp.equals(arr[i][0])){
                System.out.println("left");
            }else{
                System.out.println("right");
            }
            for (int j = 0; j < p - 1; j++) {
                String temp = input.next();
            }
        }
    }
}
