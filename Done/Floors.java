package Done;

import java.util.Scanner;

public class Floors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int in = input.nextInt();

        if(in >=13) System.out.println(in + 1);
        else System.out.println(in);

    }
}
