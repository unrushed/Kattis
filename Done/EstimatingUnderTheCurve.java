package Done;

import java.util.Scanner;

public class EstimatingUnderTheCurve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int t1 = input.nextInt();
        double v1 = input.nextDouble();
        double area =0;
        for (int i = 0; i < n - 1; i++) {
            int tTemp = input.nextInt();
            double vTemp = input.nextDouble();

            area += ((v1 + vTemp)/2) * (tTemp - t1);
            t1 = tTemp;
            v1 = vTemp;
        }

        System.out.println(area/1000);
    }
}
