package Kattis;
import java.util.Scanner;
public class HeartRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();
        int z = 0;
        while(z < testCases){
            int beats = input.nextInt();
            double time = input.nextDouble();
            double accurate = 60 * beats/ time;
            System.out.println(accurate - (accurate/beats));
            System.out.println(accurate);
            System.out.println(accurate + (accurate/beats));
            z++;
        }
    }
}
