package Kattis;
import java.util.Scanner;
public class AAndB {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(), b = input.nextInt();
        
        if(a>b){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}
