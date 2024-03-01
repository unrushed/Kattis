package Kattis;
import java.util.Scanner;
public class Cake {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), g, f, l, w;
        g = a - b;
        f = a - c;

        if (g > b) {
            w = g;
        }
        else{
            w = b;
        }
        if(f>c){
            l = f;
        }
        else{
            l = c;
        }
        System.out.print(l*w*4);
    }
}
