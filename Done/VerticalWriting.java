package Done;

import java.util.Scanner;

public class VerticalWriting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String one = input.nextLine();
        String two = input.nextLine();

        System.out.println(one.substring(0, one.indexOf("|")) + two.substring(0, two.indexOf("|")) + " " + one.substring(one.indexOf("|") + 1) + two.substring(two.indexOf("|") + 1));
    }
}
