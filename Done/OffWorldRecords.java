package Done;

import java.util.Scanner;

public class OffWorldRecords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int c = input.nextInt();
        int p = input.nextInt();

        int counter = 0;

        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();

            if(temp > c + p){
                counter++;
                p = c;
                c = temp;
            }
        }
        System.out.println(counter);
    }
}
