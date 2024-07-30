package Done;

import java.util.Scanner;

public class Honey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            int sweet = input.nextInt();
            int sour = input.nextInt();

            if(sweet == 0 && sour == 0) break;

            if(sweet + sour == 13) {
                System.out.println("Never speak again.");
            }else if( sweet == sour){
                System.out.println("Undecided.");
            }else if(sour > sweet){
                System.out.println("Left beehind.");
            }else{
                System.out.println("To the convention.");
            }
        }
    }
}
