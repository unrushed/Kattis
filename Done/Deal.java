package Done;

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(x<2021) System.out.println("1000");
        else {
            System.out.println(1100 + (100 *(x - 2021)));
        }

    }
}
