package Kattis;
import java.util.Scanner;
public class FindingAnA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.next();
        System.out.print(str.substring(str.indexOf('a')));
    }
}
