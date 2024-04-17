package Done;

import java.util.Scanner;

public class TakkThenName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPeople = input.nextInt();
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Takk " + input.next());
        }
    }
}
