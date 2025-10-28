package Done;

import java.util.Scanner;

public class AboveAverage2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();

        for (int i = 0; i < c; i++) {
            int n = input.nextInt();
            int[] list = new int[n];
            for (int j = 0; j < n; j++) {
                list[j] = input.nextInt();
            }
            double avg = findAvg(list);

            System.out.printf("%.3f%s", findPercent(avg, list), "%");
            System.out.println();

        }
    }
    public static double findAvg(int[] list){
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return Math.round((sum/list.length)*1000.0)/1000.0;
    }
    public static double findPercent(double avg, int[] list){
        int num = 0;

        for (int i = 0; i < list.length; i++) {
            if(list[i] > avg) num++;
        }
        return ((double) num /list.length) * 100;
    }
}
