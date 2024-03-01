package Kattis;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = 1, y = 0;
        double blocksGiven = input.nextInt();

        while(blocksGiven >= Math.pow(x, 2)){
            blocksGiven = blocksGiven - Math.pow(x, 2);
            y++;
            x=x+2;
        }
        System.out.println(y);
    }
    
}
