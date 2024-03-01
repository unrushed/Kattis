package Kattis;
import java.util.Scanner;
public class Quadrants {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), y = input.nextInt();
        if(x>0 && y>0){
            System.out.print("1");
        }
        else if(x>0 && y < 0){
            System.out.print("4");
        }
        else if (x<0 && y>0){
            System.out.print("2");
        }
        else if (x<0 && y<0){
            System.out.print("3");
        }
    }
}
