package Done;

import java.util.Scanner;

public class SnowFall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int snowfallTotal = 0;
        for (int i = 0; i < n; i++) {
            int type = input.nextInt();
            int number = input.nextInt();
            if(type == 1 && i == 0){
            }else if(type == 1 && snowfallTotal - number < 0) {
                snowfallTotal = 0;
            }else if(type == 1){
                snowfallTotal -= number;
            }else{
                snowfallTotal += number;
            }
        }
        System.out.println(snowfallTotal);
    }
}
