package Kattis;
import java.util.Scanner;
public class loop {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int u = userInput.nextInt(), i = 0;
        do{
            ++i;
            System.out.println(i + " Abracadabra");
        }while(i != u);
        userInput.close();
    }
}
