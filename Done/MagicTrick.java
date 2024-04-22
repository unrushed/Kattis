package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();

        ArrayList<Character> in2 = new ArrayList<Character>();

        for (int i = 0; i < in.length(); i++) {
            in2.add(in.charAt(i));
        }
        Collections.sort(in2);

        boolean test = false;

        for (int i = 0; i < in2.size() - 1; i++) {
            char temp = in2.get(i);
            if(temp == in2.get(i + 1)){
                test = true;
                break;
            }
        }

        if(test) System.out.println("0");
        else System.out.println("1");
    }
}
