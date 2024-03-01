package Kattis;
import java.util.Scanner;
public class ElectricalOutlets {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();
        int outletsSum = 0;

        for(int x = 0; x < testCases; x++){
            int powerStrips = input.nextInt();
            for(int y = 0; y < powerStrips; y++){
                outletsSum += input.nextInt();
            }
            outletsSum = outletsSum - (powerStrips - 1);
            System.out.println(outletsSum);
            outletsSum = 0;
        }
    }
}
