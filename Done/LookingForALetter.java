package Done;

import java.util.Scanner;

public class LookingForALetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        char letter = input.nextLine().charAt(0);
        String letters = input.nextLine();
        boolean found = true;

        for (int i = 0; i < n; i++) {
            if(letters.charAt(i) == letter){
                found = false;
                System.out.println("Unnar fann hana!");
                break;
            }
        }
        if(found) System.out.println("Unnar fann hana ekki!");
    }
}
