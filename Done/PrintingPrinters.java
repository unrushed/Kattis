package Done;

import java.util.Scanner;

public class PrintingPrinters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = 1;
        int days = 1;
        while(!(n <= m)){
            m *= 2;
            days++;
        }
        System.out.println(days);
    }
}
