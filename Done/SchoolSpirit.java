package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSpirit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double sum = 0.0;
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double temp = input.nextDouble();
            list.add(temp);
        }

        System.out.println(calculateScoreWithOneRemove(list, -1));

        for (int i = 0; i < n; i++) {
            sum += calculateScoreWithOneRemove(list, i);
        }
        System.out.println(sum/n);
    }
    public static double calculateScoreWithOneRemove(ArrayList<Double> list, int indexRemove){
        double sum = 0.0;

        for (int i = 0, g =0; i < list.size(); i++, g++) {
            if(i == indexRemove) {
                g--;
                continue;
            }
            sum += (list.get(i) * Math.pow((4.0 /5.0),g));
        }

        return 1.0/5.0 * sum;
    }
}
