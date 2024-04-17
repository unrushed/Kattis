package Done;

import java.util.Scanner;

public class Balloon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int velocity = in.nextInt();
        int acceleration = in.nextInt();
        int time = in.nextInt();

        System.out.println((velocity*time) + ((0.5 *acceleration) * (time * time)));
    }
}
