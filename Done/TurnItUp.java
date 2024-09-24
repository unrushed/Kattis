package Done;

import java.util.Scanner;

public class TurnItUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = Integer.parseInt(input.nextLine());
        int volume = 7;
        for (int i = 0; i < x; i++) {
            switch (input.nextLine()){
                case "Skru op!":
                    if(volume < 10) {
                        volume++;
                    }

                    break;
                case "Skru ned!":
                    if(volume > 0){
                        volume--;
                    }
                    break;
            }
        }
        System.out.println(volume);
    }
}
