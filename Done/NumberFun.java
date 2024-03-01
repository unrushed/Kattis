package Kattis;
import java.util.Scanner;
public class NumberFun {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfTests = input.nextInt();
        int a, b, c;

        for(int x = 0; x < numberOfTests; x++){
            a = input.nextInt(); b = input.nextInt(); c = input.nextInt();
            if(possible(a, b, c)){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
        }
        
    }
    public static boolean possible(int a, int b, int c){
        if(a + b == c){
            return true;
        }else if(a - b == c || b - a == c){
            return true;
        }else if(a * b == c){
            return true;
        }else if((double) a / b == c || (double) b / a == c){
            return true;
        }else{
            return false;
        }

    }
}
