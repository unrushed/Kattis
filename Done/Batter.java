package Kattis;
import java.util.Scanner;
public class Batter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfTests = input.nextInt();
        int sum = 0;
        int num = 0;
        for(int x = 0; x < numberOfTests; x++){
            int temp = input.nextInt();

            if(temp > -1){ 
                sum += temp; 
                num++;
            }
        }
        System.out.println((double) sum/num);
    }
}
