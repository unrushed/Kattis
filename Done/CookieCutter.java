package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class CookieCutter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfCoordinates = input.nextInt();
        double xFirst = input.nextDouble();
        double xFirstF = xFirst;
        double yFirst = input.nextDouble();
        double yFirstF = yFirst;
        ArrayList<Double> listX = new ArrayList<>();
        ArrayList<Double> listY = new ArrayList<>();
        listX.add(xFirst);
        listY.add(yFirst);
        double area = 0.0;
        double xTemp = 0;
        double yTemp = 0;
        for (int i = 0; i < numberOfCoordinates - 1; i++) {
            xTemp = input.nextDouble();
            yTemp = input.nextDouble();

            area += (xFirst*yTemp) - (xTemp*yFirst);
            listX.add(xTemp);
            listY.add(yTemp);
            xFirst = xTemp;
            yFirst = yTemp;
        }
        area += Math.abs((xFirst*yFirstF) - (xFirstF*yFirst));
        double wantingSize = input.nextDouble();
        double portion = Math.sqrt(wantingSize / ((1.0/2.0) * Math.abs(area)));

        for (int i = 0; i < listX.size(); i++) {
            listX.set(i, listX.get(i) * portion);
            listY.set(i, listY.get(i) * portion);
        }

        //finding the smallest number
        Double x = 0.0;
        Double y = 0.0;
        for (int i = 0; i < listX.size(); i++) {
            if(listX.get(i) < x) x = listX.get(i);
            if(listY.get(i) < y) y = listY.get(i);
        }

        for (int i = 0; i < listX.size(); i++) {
            System.out.print(listX.get(i) + Math.abs(x) + " ");
            System.out.println(listY.get(i) + Math.abs(y));

        }
    }
}
