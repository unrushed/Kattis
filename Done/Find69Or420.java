package Done;

import java.util.Scanner;

public class Find69Or420 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();

        if(a.contains("69") || a.contains("420")) System.out.println("Mergjad!");
        else System.out.println("Leim!");
    }
}
