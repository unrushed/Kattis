package Kattis;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x= input.nextInt(), y = input.nextInt(), z = input.nextInt();

        for(int a = 1; a < z + 1; a++){
            if(a%x == 0 && a%y == 0){
                System.out.println("FizzBuzz");
            }else if(a%x == 0){
                System.out.println("Fizz");
            }else if(a%y == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(a);
            }
        }
    }
}
