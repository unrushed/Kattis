package Kattis;
import java.util.Scanner;
public class SeedCostSow {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double seedCost =input.nextDouble(), lawns = input.nextDouble(), ltemp, wtemp, totalArea = 0;
        for(int x = 0; x < lawns; x++){
            ltemp = input.nextDouble();
            wtemp = input.nextDouble();
            totalArea = totalArea + (ltemp * wtemp);
        }
        System.out.print(totalArea*seedCost);
    }
}
