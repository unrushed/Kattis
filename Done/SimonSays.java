package Done;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = Integer.parseInt(input.nextLine());
        for (int i = 0; i < lines; i++) {
            String temp = input.nextLine();

            if(temp.startsWith("Simon says"))
                System.out.println(temp.substring(10));
        }
    }
}
