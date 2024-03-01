package Kattis;
import java.util.Scanner;
public class Field {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int area = input.nextInt();
        double perimeter;

        perimeter = (Math.sqrt(area)) * 4;
        System.out.printf("%.6f",perimeter);
    }
}
