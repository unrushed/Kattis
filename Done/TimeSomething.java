package Kattis;
import java.util.Scanner;
public class TimeSomething {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        System.out.print(z-(x+y));
    }
}
