package Done;

import java.util.Scanner;

public class StickyKeys2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] in = input.nextLine().split("");
        String previous = in[0];
        for (int i = 1; i < in.length; i++) {
            if(in[i].equals(previous))
                in[i] = null;
            else{
                previous = in[i];
            }
        }

        for (int i = 0; i < in.length; i++) {
            if(in[i] != null) System.out.print(in[i]);
        }
    }
}
