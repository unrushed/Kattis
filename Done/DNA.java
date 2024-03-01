package Kattis;
import java.util.Scanner;
public class DNA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next().toUpperCase();
        System.out.println(str.indexOf("COV"));
        if(str.indexOf("cov") > -1){
            System.out.print("Veikur!");
        }
        else{
            System.out.print("Ekki veikur!");
        }
    }
}