package Done;

import java.util.Scanner;

public class Zoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfNumbers = input.nextInt();


        int every = input.nextInt();
        int p = 1;

        for (int i = 0; i < numberOfNumbers; i++, p++) {
            int n = input.nextInt();
            if(every == p){
                p = 0;
                System.out.print(n + " ");
            }

        }
    }
}
