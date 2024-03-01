package Kattis;
import java.util.Scanner;
public class CheckIfOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numberOfNumbers = input.nextInt();
        int[] list;

        list = new int[ numberOfNumbers];

        for(int x = 0; x < numberOfNumbers; x++){
            list[x] = input.nextInt();
        }
        for(int z = 0; z < numberOfNumbers; z++){
            if(list[z]%2 == 0){
                System.out.println(list[z]+ " is even");
            }else{
                System.out.println(list[z]+ " is odd");
            }
        }
    }
}
