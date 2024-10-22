package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class BikeBarricades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfBaricades = input.nextInt();
        boolean baricadeFound = false;
        ArrayList<Double> baricade = new ArrayList<>();

        for (int i = 0; i < numberOfBaricades; i++) {
            double x1 = input.nextInt();
            double y1 = input.nextInt();

            double x2 = input.nextInt();
            double y2 = input.nextInt();
            if(x1 > 0 && x2 > 0) continue;
            else if(x1 < 0 && x2 < 0) continue;
            double m = (y2 - y1)/(x2- x1);

            double b = y1 - (x1 * m);

            if(b < 0) continue;
            baricade.add(b);

            baricadeFound = true;

        }
        baricade.sort(null);
        if(!baricadeFound) System.out.println(-1.0);
        else System.out.println(baricade.get(0));
    }
}
