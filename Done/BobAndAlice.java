package Kattis;
import java.util.Scanner;
public class BobAndAlice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number%2 == 0){
            System.out.print("Bob");
        }else{
            System.out.print("Alice");
        }
    }
}
