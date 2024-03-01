package Kattis;
import java.util.Scanner;
public class Echo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        for(int x = 0; x < 3; x++){
            System.out.println(str);
        }
    }
}
