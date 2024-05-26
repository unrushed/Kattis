package Done;

import java.util.Scanner;

public class Hurray2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = Integer.parseInt(input.next());
        for (int i = 0; i < age; i++) {
            System.out.println("Hipp hipp hurra, " + name + "!");
        }
    }
}


