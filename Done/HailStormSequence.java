package Done;

import java.util.Scanner;

public class HailStormSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long x = input.nextLong();
        int count = 1;

        while(x != 1){
            if(x%2 == 0){
                x /= 2;
            }else{
                x = 3*x+1;
            }
            count++;
        }
        System.out.println(count);
    }
}
