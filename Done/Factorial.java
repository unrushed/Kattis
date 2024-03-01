package Kattis;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();
        int z = 0;
        while(z < testCases){
            int factorial = input.nextInt();
            int out = 1;
            if (factorial > 4) {
                System.out.println("0");
            }else if (factorial == 4){
                System.out.println("4");
            }else{
                for (int i = 1; i < factorial + 1; i++) {
                    out = out * i;
                }
                System.out.println(out);
            }
            z++;
        }
    }
}
