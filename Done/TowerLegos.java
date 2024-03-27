package Done;

import java.util.Scanner;

public class TowerLegos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num = input.nextInt();
        int out = 0;
        int temp = 0;

        for (int i = 0; i < num; i++) {
            int num2 = input.nextInt();
            if(num2 > temp){
                out++;
            }
            temp = num2;
        }
        System.out.println(out);

    }
}
