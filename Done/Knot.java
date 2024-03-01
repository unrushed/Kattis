package Kattis;
import java.util.Scanner;
public class Knot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfKnots = input.nextInt();
        int[] knots = new int[numberOfKnots];
        int[] knotsKnown = new int[numberOfKnots - 1];
        boolean found = false;

        for (int i = 0; i < numberOfKnots; i++) {
            knots[i] = input.nextInt();
        }

        for (int i = 0; i < numberOfKnots - 1; i++) {
            knotsKnown[i] = input.nextInt();
        }

        for (int i = 0; i < numberOfKnots; i++) {
            for (int i1 = 0; i1 < numberOfKnots - 1; i1++) {
                if(knots[i] == knotsKnown[i1]) {
                    found = true;
                    break;
                }
            }
            if(found) {
                found = false;
            }else {
                System.out.println(knots[i]);
                break;
            }
        }

    }
}
