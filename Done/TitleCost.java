package Kattis;
import java.util.Scanner;
public class TitleCost {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nameOfMovie = input.next();
        double cap = input.nextDouble();

        String number = nameOfMovie.substring(nameOfMovie.indexOf(" ") + 1);

        if(nameOfMovie.length() < cap){
            System.out.print(nameOfMovie.length());
        }else{
            System.out.print(cap);
        }

    }
}
